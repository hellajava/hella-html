package sh.hella.html.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sh.hella.html.Hella;
import spark.Filter;
import spark.Request;
import spark.Response;

import java.util.UUID;

/**
 * The type Web context initializer.
 */
public class WebContextInitializer implements Filter {
    private static final Logger logger = LoggerFactory.getLogger(WebContextInitializer.class.getName());
    private static final String X_HELLA_WEBCONTEXT_ID = "X-Hella-WebContext-ID";

    @Override
    public void handle(Request req, Response res) throws Exception {
        String webContextId = req.cookie(X_HELLA_WEBCONTEXT_ID);
        if (webContextId == null) {
            webContextId = UUID.randomUUID().toString().replace("-", "");
            res.cookie(X_HELLA_WEBCONTEXT_ID, webContextId);
        }

        WebContext webContext = Hella.WEB_CONTEXT_MAP.get(webContextId);
        if (webContext == null) {
            webContext = new WebContext(webContextId);
            Hella.WEB_CONTEXT_MAP.put(webContextId, webContext);
        }

        Hella.CONTEXT.set(webContext);
        logger.debug("Initialized WebContext with ID {}", webContextId);
    }
}
