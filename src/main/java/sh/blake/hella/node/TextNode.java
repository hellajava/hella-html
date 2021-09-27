package sh.blake.hella.node;

/**
 * The type Text node.
 */
public class TextNode extends Node {
    private final String text;

    /**
     * Instantiates a new Text node.
     *
     * @param text the text
     */
    public TextNode(String text) {
        super("text");
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
