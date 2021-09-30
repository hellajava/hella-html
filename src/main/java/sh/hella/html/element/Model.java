package sh.hella.html.element;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * An {@link Element} with state management utilities.
 */
public abstract class Model extends Element {
    private static final Gson gson = new Gson();
    private static final Map<String, Model> models = new HashMap<>();
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

    /**
     * Update the state of the model. Calls a {@link Runnable} to define the new state and injects HTML/JavaScript code
     * that will POST the new state to the server.
     *
     * @param stateUpdater The state updating {@code Runnable}.
     * @return The {@code JavaScriptElement} that implements the state update
     */
    public JavaScriptElement updateState(Runnable stateUpdater) {
        stateUpdater.run();
        String url = "http://localhost:4567/model/" + uuid;
        String js = "_hella_post('" + url + "', " + gson.toJson(this) + ")";
        return new JavaScriptElement(js);
    }

    /**
     * Gets a previously rendered model by UUID.
     *
     * @param uuid The UUID
     * @return The model
     */
    public static Model get(String uuid) {
        return models.get(uuid);
    }

    /**
     * Sets a model by UUID.
     *
     * @param uuid The UUID
     * @param model The model
     */
    public static void set(String uuid, Model model) {
        models.put(uuid, model);
    }
}
