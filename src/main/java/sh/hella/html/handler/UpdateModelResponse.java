package sh.hella.html.handler;

public class UpdateModelResponse {
    private final String uuid;
    private final String body;

    public UpdateModelResponse(String uuid, String body) {
        this.uuid = uuid;
        this.body = body;
    }

    public String getUuid() {
        return uuid;
    }

    public String getBody() {
        return body;
    }
}
