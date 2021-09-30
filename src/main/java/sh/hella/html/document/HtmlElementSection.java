package sh.hella.html.document;

/**
 * The type HtmlElementSection.
 */
public class HtmlElementSection extends ElementSection {

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
        return "<!DOCTYPE html>" + super.toString();
    }
}
