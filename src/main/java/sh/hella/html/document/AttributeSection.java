package sh.hella.html.document;

import sh.hella.html.handler.RpcMessageDecoder;
import sh.hella.html.handler.WebContext;
import sh.hella.html.handler.WebSocketHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * The type AttributeSection.
 */
public class AttributeSection extends Section {
    private final String name;
    private final String value;
    private final List<RpcMessageDecoder<?>> rpcMessageDecoders = new ArrayList<>();

    /**
     * Instantiates a new AttributeSection.
     *
     * @param name  the name
     * @param value the value
     */
    public AttributeSection(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        WebContext context = WebSocketHandler.getContextForPageId(getPageId());
        for (RpcMessageDecoder<?> rpcMessageDecoder : rpcMessageDecoders) {
            context.getRpcMessageDecoderMap().put(rpcMessageDecoder.getRpcUuid(), rpcMessageDecoder);
        }
        rpcMessageDecoders.clear();
        return name + "=\"" + value + "\"";
    }

    /**
     * Add rpc message decoder attribute section.
     *
     * @param rpcMessageDecoder the rpc message decoder
     * @return the attribute section
     */
    public AttributeSection addRpcMessageDecoder(RpcMessageDecoder<?> rpcMessageDecoder) {
        rpcMessageDecoders.add(rpcMessageDecoder);
        return this;
    }
}
