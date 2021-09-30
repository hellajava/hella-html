package sh.hella.html.document;

/**
 * The type AttributeSection.
 */
public class AttributeSection extends Section {
    private final String name;
    private final String value;

    /**
     * Instantiates a new AttributeSection.
     *
     * @param name  the name
     * @param value the value
     */
    public AttributeSection(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return name + "=\"" + value + "\"";
    }
}
