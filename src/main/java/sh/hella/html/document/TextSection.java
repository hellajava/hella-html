package sh.hella.html.document;

/**
 * The type TextSection.
 */
public class TextSection extends Section {
    private final String text;

    /**
     * Instantiates a new TextSection.
     *
     * @param text the text
     */
    public TextSection(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
