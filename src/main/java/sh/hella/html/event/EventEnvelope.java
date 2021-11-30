package sh.hella.html.event;

/**
 * The type Event envelope.
 */
public class EventEnvelope {
    private String eventId;
    private String eventBody;

    /**
     * Gets event id.
     *
     * @return the event id
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * Sets event id.
     *
     * @param eventId the event id
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * Gets event body.
     *
     * @return the event body
     */
    public String getEventBody() {
        return eventBody;
    }

    /**
     * Sets event body.
     *
     * @param eventBody the event body
     */
    public void setEventBody(String eventBody) {
        this.eventBody = eventBody;
    }
}
