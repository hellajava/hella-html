package sh.hella.html.node;

/**
 * The type Html node.
 */
public class HtmlNode extends Node {
    /**
     * Instantiates a new Html node.
     *
     * @param children the children
     */
    public HtmlNode(Node... children) {
        super("html", children);
    }

    @Override
    public String toString() {
        return "<!DOCTYPE html>" + super.toString();
    }
}
