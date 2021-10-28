package sh.hella.html.document;

import sh.hella.html.handler.WebContext;
import sh.hella.html.handler.WebSocketHandler;

import java.util.UUID;

import static sh.hella.html.Html.*;

/**
 * The type HtmlElementSection.
 */
public class HtmlElementSection extends ElementSection {
    private final String pageId = UUID.randomUUID().toString();

    /**
     * Instantiates a new HtmlElementSection.
     *
     * @param children the children
     */
    public HtmlElementSection(Section... children) {
        super("html", children);
    }

    @Override
    public String toString() {
        add(attr("page-id", pageId));
        WebSocketHandler.setContextForPageId(pageId, new WebContext(pageId));
        for (Section section : sections()) {
            section.setPageId(pageId);
        }
        return "<!DOCTYPE html>" + super.toString();
    }
}
