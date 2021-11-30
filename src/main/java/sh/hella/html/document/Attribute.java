package sh.hella.html.document;

/**
 * The type Attribute.
 */
public class Attribute extends Section {
    private final String name;
    private final String value;

    /**
     * Instantiates a new Attribute.
     *
     * @param name  the name
     * @param value the value
     */
    public Attribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return name + "=\"" + value + "\"";
    }
}
