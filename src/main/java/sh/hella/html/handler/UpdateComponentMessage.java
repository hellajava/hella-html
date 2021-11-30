package sh.hella.html.handler;

/**
 * The type Update component message.
 */
public class UpdateComponentMessage {
    private String eventId = "updateComponent";
    private final String componentId;
    private final String body;

    /**
     * Instantiates a new Update component message.
     *
     * @param componentId the uuid
     * @param body        the body
     */
    public UpdateComponentMessage(final String componentId, final String body) {
        this.componentId = componentId;
        this.body = body;
    }

    /**
     * Gets event id.
     *
     * @return the event id
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * Gets uuid.
     *
     * @return the uuid
     */
    public String getComponentId() {
        return componentId;
    }

    /**
     * Gets body.
     *
     * @return the body
     */
    public String getBody() {
        return body;
    }
}
