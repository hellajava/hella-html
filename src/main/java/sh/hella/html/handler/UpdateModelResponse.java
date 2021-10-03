package sh.hella.html.handler;

/**
 * The type Update model response.
 */
public class UpdateModelResponse {
    private final String uuid;
    private final String body;

    /**
     * Instantiates a new Update model response.
     *
     * @param uuid the uuid
     * @param body the body
     */
    public UpdateModelResponse(final String uuid, final String body) {
        this.uuid = uuid;
        this.body = body;
    }

    /**
     * Gets uuid.
     *
     * @return the uuid
     */
    public String getUuid() {
        return uuid;
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
