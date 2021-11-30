package sh.hella.html.document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import sh.hella.html.Hella;
import sh.hella.html.handler.UpdateComponentMessage;

import java.io.IOException;
import java.util.UUID;

import static sh.hella.html.Html.attr;

/**
 * A {@link Section} with state management utilities.
 */
@SuppressWarnings("unchecked")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@modelType")
public abstract class Component extends Section {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private final String componentId = UUID.randomUUID().toString().replace("-", "");

    /**
     * Renders the model.
     *
     * @return The elements representing the model
     */
    public abstract Section render();

    @Override
    public String toString() {
        sections().clear();
        add(render().add(attr("data-component-id", componentId)));
        return super.toString();
    }

    /**
     * Rehydrate - re-renders the model and sends to all subscribed sessions.
     */
    public void rehydrate() {
        try {
            String json = objectMapper.writeValueAsString(new UpdateComponentMessage(componentId, render().toString()));
            Hella.CONTEXT.get().getWebSocketSession().getRemote().sendString(json);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
