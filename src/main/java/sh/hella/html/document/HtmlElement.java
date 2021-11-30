package sh.hella.html.document;

/**
 * The type HtmlElement.
 */
public class HtmlElement extends Element {

    /**
     * Instantiates a new HtmlElement.
     *
     * @param children the children
     */
    public HtmlElement(Section... children) {
        super("html", children);
    }

    @Override
    public String toString() {
        return "<!DOCTYPE html>" + super.toString();
    }
}
