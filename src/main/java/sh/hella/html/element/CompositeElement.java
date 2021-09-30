package sh.hella.html.element;

public class CompositeElement extends Element {

    /**
     * Instantiates a new CompositeElement.
     *
     * @param children the children
     */
    public CompositeElement(Element... children) {
        super("", children);
    }

    @Override
    public String toString() {
        final StringBuilder elements = new StringBuilder();
        for (Element element : children()) {
            if (element instanceof Attribute) {
                throw new IllegalStateException("A group of elements cannot have an attribute");
            }
            elements.append(element);
        }
        return elements.toString();
    }

}
