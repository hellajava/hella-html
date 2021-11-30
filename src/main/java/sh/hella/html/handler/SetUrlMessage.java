package sh.hella.html.handler;

/**
 * The type Set url message.
 */
public class SetUrlMessage {
    private String eventId = "setUrl";
    private final String url;

    /**
     * Instantiates a new Set url message.
     *
     * @param url the url
     */
    public SetUrlMessage(String url) {
        this.url = url;
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
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }
}
