package sh.hella.html.element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * The type Element.
 */
@SuppressWarnings("unused")
public class Element {
    private transient final String name;
    private transient final List<Element> children;

    /**
     * Instantiates a new Element.
     *
     * @param name     the name
     * @param children the children
     */
    public Element(String name, Element... children) {
        this.name = name;
        this.children = new ArrayList<>(Arrays.asList(children));
    }

    @Override
    public String toString() {
        final StringBuilder attributes = new StringBuilder();
        final StringBuilder elements = new StringBuilder();
        for (Element element : children) {
            if (element instanceof Attribute) {
                attributes.append(" ").append(element);
            } else {
                elements.append(element);
            }
        }
        return "<" + name + attributes + ">" + elements + "</" + name + ">";
    }

    /**
     * Add element.
     *
     * @param children the children
     * @return the element
     */
    public Element add(Collection<Element> children) {
        this.children.addAll(children);
        return this;
    }

    /**
     * Add element.
     *
     * @param children the children
     * @return the element
     */
    public Element add(Element... children) {
        return add(Arrays.asList(children));
    }

    /**
     * Remove element.
     *
     * @param children the children
     * @return the element
     */
    public Element remove(Collection<Element> children) {
        this.children.removeAll(children);
        return this;
    }

    /**
     * Remove element.
     *
     * @param children the children
     * @return the element
     */
    public Element remove(Element... children) {
        return remove(Arrays.asList(children));
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String name() {
        return name;
    }

    /**
     * Gets children.
     *
     * @return the children
     */
    public List<Element> children() {
        return children;
    }
}
