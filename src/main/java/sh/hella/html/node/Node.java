package sh.hella.html.node;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * The type Node.
 */
@SuppressWarnings("unused")
public class Node {
    private final String name;
    private final List<Node> children;

    /**
     * Instantiates a new Node.
     *
     * @param name     the name
     * @param children the children
     */
    public Node(String name, Node... children) {
        this.name = name;
        this.children = Arrays.asList(children);
    }

    @Override
    public String toString() {
        final StringBuilder attributes = new StringBuilder();
        final StringBuilder elements = new StringBuilder();
        for (Node node : children) {
            if (node instanceof AttributeNode) {
                attributes.append(" ").append(node);
            } else {
                elements.append(node);
            }
        }
        return "<" + name + attributes + ">" + elements + "</" + name + ">";
    }

    /**
     * Add node.
     *
     * @param children the children
     * @return the node
     */
    public Node add(Collection<Node> children) {
        this.children.addAll(children);
        return this;
    }

    /**
     * Add node.
     *
     * @param children the children
     * @return the node
     */
    public Node add(Node... children) {
        return add(Arrays.asList(children));
    }

    /**
     * Remove node.
     *
     * @param children the children
     * @return the node
     */
    public Node remove(Collection<Node> children) {
        this.children.removeAll(children);
        return this;
    }

    /**
     * Remove node.
     *
     * @param children the children
     * @return the node
     */
    public Node remove(Node... children) {
        return remove(Arrays.asList(children));
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets children.
     *
     * @return the children
     */
    public List<Node> getChildren() {
        return children;
    }
}
