package sh.hella.html.element;

/**
 * The type Html node.
 */
public class HtmlDocumentElement extends Element {

    /**
     * Instantiates a new Html node.
     *
     * @param children the children
     */
    public HtmlDocumentElement(Element... children) {
        super("html", children);
    }

    @Override
    public String toString() {
        return "<!DOCTYPE html>" + super.toString();
    }
}
