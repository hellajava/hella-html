package sh.hella.html.event;

/**
 * The interface Event handler.
 *
 * @param <E> the type parameter
 */
public interface EventHandler<E extends Event> {

    /**
     * Handle.
     *
     * @param event the event
     */
    void handle(E event);
}
