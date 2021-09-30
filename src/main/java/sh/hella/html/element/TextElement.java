package sh.hella.html.element;

/**
 * The type Text element.
 */
public class TextElement extends Element {
    private final String text;

    /**
     * Instantiates a new Text element.
     *
     * @param text the text
     */
    public TextElement(String text) {
        super("text");
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
