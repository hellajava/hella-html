package sh.hella.html.handler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import sh.hella.html.event.Event;
import sh.hella.html.event.EventHandler;

/**
 * The type Rpc message decoder.
 *
 * @param <E> the type parameter
 */
public class RpcMessageDecoder<E extends Event> implements EventHandler<RpcMessage> {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private final String rpcUuid;
    private final EventHandler<E> eventHandler;
    private final Class<E> eventType;

    /**
     * Instantiates a new Rpc message decoder.
     *
     * @param eventHandler the event handler
     * @param eventType    the event type
     */
    public RpcMessageDecoder(String rpcUuid, EventHandler<E> eventHandler, Class<E> eventType) {
        this.rpcUuid = rpcUuid;
        this.eventHandler = eventHandler;
        this.eventType = eventType;
    }

    @Override
    public void handle(RpcMessage rpcMessage) {
        try {
            String content = rpcMessage.data == null ? "{}" : rpcMessage.data;
            E event = objectMapper.readValue(content, eventType);
            event.setSession(rpcMessage.getSession());
            eventHandler.handle(event);
        } catch (JsonProcessingException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Gets rpc uuid.
     *
     * @return the rpc uuid
     */
    public String getRpcUuid() {
        return rpcUuid;
    }

    /**
     * Gets event handler.
     *
     * @return the event handler
     */
    public EventHandler<E> getEventHandler() {
        return eventHandler;
    }

    /**
     * Gets event type.
     *
     * @return the event type
     */
    public Class<E> getEventType() {
        return eventType;
    }
}
