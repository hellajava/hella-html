package sh.hella.html.document;

/**
 * A {@link Section} representing an HTML element with attributes and children.
 */
@SuppressWarnings("unused")
public class ElementSection extends Section {
    private final transient String name;

    /**
     * Instantiates a new ElementSection.
     *
     * @param name     the name
     * @param children the children
     */
    public ElementSection(String name, Section... children) {
        super(children);
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder attributes = new StringBuilder();
        final StringBuilder elements = new StringBuilder();
        for (Section section : sections()) {
            if (section == null) {
                continue;
            }
            if (section instanceof AttributeSection) {
                attributes.append(" ").append(section);
            } else {
                elements.append(section);
            }
        }
        return "<" + name + attributes + ">" + elements + "</" + name + ">";
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String name() {
        return name;
    }
}
