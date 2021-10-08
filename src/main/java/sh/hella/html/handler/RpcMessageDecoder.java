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
    private final EventHandler<E> eventHandler;
    private final Class<E> eventType;

    /**
     * Instantiates a new Rpc message decoder.
     *
     * @param eventHandler the event handler
     * @param eventType    the event type
     */
    public RpcMessageDecoder(EventHandler<E> eventHandler, Class<E> eventType) {
        this.eventHandler = eventHandler;
        this.eventType = eventType;
    }

    @Override
    public void handle(RpcMessage rpcMessage) {
        try {
            String content = rpcMessage.data == null ? "{}" : rpcMessage.data;
            eventHandler.handle(objectMapper.readValue(content, eventType));
        } catch (JsonProcessingException ex) {
            throw new RuntimeException(ex);
        }
    }
}
