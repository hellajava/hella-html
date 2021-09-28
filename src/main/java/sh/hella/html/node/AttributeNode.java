package sh.hella.html.node;

/**
 * The type Attribute node.
 */
public class AttributeNode extends Node {
    private final String name;
    private final String value;

    /**
     * Instantiates a new Attribute node.
     *
     * @param name  the name
     * @param value the value
     */
    public AttributeNode(String name, String value) {
        super("attribute");
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return name + "=\"" + value + "\"";
    }
}
