package sh.hella.html.element;

/**
 * The type Attribute node.
 */
public class Attribute extends Element {
    private final String name;
    private final String value;

    /**
     * Instantiates a new Attribute node.
     *
     * @param name  the name
     * @param value the value
     */
    public Attribute(String name, String value) {
        super("attribute");
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return name + "=\"" + value + "\"";
    }
}
