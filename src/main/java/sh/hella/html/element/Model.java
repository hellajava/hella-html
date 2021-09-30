package sh.hella.html.element;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * An {@link Element} with state management utilities.
 */
@SuppressWarnings("unchecked")
public abstract class Model<M extends Model<?>> extends Element implements Cloneable {
    private static final Gson gson = new Gson();
    private static final Map<String, Model<?>> models = new HashMap<>();
    private transient final String uuid = UUID.randomUUID().toString().replace("-", "");

    /**
     * Instantiates a new {@code Model} as a {@code div} tag with children.
     *
     * @param children The children
     */
    public Model(Element... children) {
        this("div", children);
    }

    /**
     * Instantiates a new {@code Model} with a tag type children.
     *
     * @param tag The tag type
     * @param children The children
     */
    public Model(String tag, Element... children) {
        super(tag, children);
    }

    /**
     * Renders the model.
     *
     * @return The element representing the model
     */
    public abstract Element render();

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
     * @param stateUpdater The state updating {@code Runnable}.
     * @return The {@code JavaScriptElement} that implements the state update
     */
    public JavaScriptElement updateState(Consumer<M> stateUpdater) {
        M modelClone = (M) clone();
        stateUpdater.accept(modelClone);
        String url = "http://localhost:4567/model/" + uuid;
        String js = "_hella_post('" + url + "', " + gson.toJson(modelClone) + ")";
        return new JavaScriptElement(js);
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
