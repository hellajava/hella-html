package sh.hella.html.document;

import java.util.UUID;

import static sh.hella.html.Html.div;
import static sh.hella.html.Html.id;
import static sh.hella.html.Html.style;
import static sh.hella.html.Html.text;

/**
 * The type HtmlElementSection.
 */
public class HtmlElementSection extends ElementSection {
    private static final String pageId = UUID.randomUUID().toString();

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
        add(div(id("page-id"), style("display: none"), text(pageId)));
        for (Section section : sections()) {
            section.setPageId(pageId);
        }
        return "<!DOCTYPE html>" + super.toString();
    }
}
