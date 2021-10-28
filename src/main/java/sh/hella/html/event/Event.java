package sh.hella.html.event;

import sh.hella.html.handler.WebContext;

/**
 * The abstract class Event.
 */
public abstract class Event {
    private WebContext session;

    /**
     * Gets session
     * @return The session
     */
    public WebContext getSession() {
        return session;
    }

    /**
     * Sets session.
     * @param session The session
     */
    public void setSession(WebContext session) {
        this.session = session;
    }
}
