package sh.hella.html.document;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * A {@link Section} with state management utilities.
 */
@SuppressWarnings("unchecked")
public abstract class Model<M extends Model<?>> extends Section implements Cloneable {
    private static final Gson gson = new Gson();
    private static final Map<String, Model<?>> models = new HashMap<>();
    private transient final String uuid = UUID.randomUUID().toString().replace("-", "");

    /**
     * Renders the model.
     *
     * @return The elements representing the model
     */
    public abstract Section render();

    @Override
    public String toString() {
        set(uuid, this);
        add(render());
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
        M modelClone = (M) clone();
        stateUpdater.accept(modelClone);
        String url = "http://localhost:4567/_hella_model/" + uuid;
        String js = "_hella_put('" + url + "', " + gson.toJson(modelClone) + ")";
        return new JavaScriptSection(js);
    }

    /**
     * Gets a previously rendered model by UUID.
     *
     * @param uuid The UUID
     * @return The model
     */
    public static Model<?> get(String uuid) {
        return models.get(uuid);
    }

    /**
     * Sets a model by UUID.
     *
     * @param uuid The UUID
     * @param model The model
     */
    public static void set(String uuid, Model<?> model) {
        models.put(uuid, model);
    }
}
