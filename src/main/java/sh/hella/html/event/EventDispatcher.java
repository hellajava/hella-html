package sh.hella.html.event;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The type Event dispatcher.
 *
 * @param <E> the type parameter
 */
public class EventDispatcher<E extends Event> {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private final Class<E> eventType;
    private final EventHandler<E> eventHandler;

    /**
     * Instantiates a new Event dispatcher.
     *
     * @param eventType    the event type
     * @param eventHandler the event handler
     */
    public EventDispatcher(Class<E> eventType, EventHandler<E> eventHandler) {
        this.eventType = eventType;
        this.eventHandler = eventHandler;
    }

    /**
     * Dispatch.
     *
     * @param eventBody the event body
     * @throws JsonProcessingException the json processing exception
     */
    public void dispatch(String eventBody) throws JsonProcessingException {
        eventHandler.handle(objectMapper.readValue(eventBody, eventType));
    }
}
