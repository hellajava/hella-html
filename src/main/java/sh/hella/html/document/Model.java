package sh.hella.html.document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import sh.hella.html.util.ObjectMapperFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;

import static sh.hella.html.Html.id;

/**
 * A {@link Section} with state management utilities.
 */
@SuppressWarnings("unchecked")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@modelType")
public abstract class Model<M extends Model<?>> extends Section implements Cloneable {
    public static final ObjectMapper OBJECT_MAPPER = ObjectMapperFactory.get();
    private static final Map<String, Model<?>> models = new HashMap<>();
    public final String uuid = UUID.randomUUID().toString().replace("-", "");
    private Consumer<M> onUpdate;

    public Model() {
        models.put(uuid, this);
    }

    /**
     * Renders the model.
     *
     * @return The elements representing the model
     */
    public abstract Section render();

    @Override
    public String toString() {
        sections().clear();
        add(render().add(id(uuid)));
        return super.toString();
    }

    @Override
    public Model<M> clone() {
        try {
            return (Model<M>) super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Update the state of the model. Calls a {@link Consumer} with a clone of this model (to perform modifications on)
     * and generates JavaScript which calls the server to update the state with the data in the resulting clone.
     *
     * @param stateUpdater The {@code Consumer} that updates the state.
     * @return The {@code JavaScriptSection} that implements the state update
     */
    public JavaScriptSection updateState(Consumer<M> stateUpdater) {
        try {
            M modelClone = (M) clone();
            stateUpdater.accept(modelClone);
            String js = "_hella_update_model(" + OBJECT_MAPPER.writeValueAsString(modelClone) + ")";
            js = js.replace("\"", "&quot;");
            return new JavaScriptSection(js);
        } catch (JsonProcessingException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static Model<?> get(String uuid) {
        return models.get(uuid);
    }

    public Consumer<M> onUpdate() {
        return onUpdate;
    }

    public void onUpdate(Consumer<M> onUpdate) {
        this.onUpdate = onUpdate;
    }
}
