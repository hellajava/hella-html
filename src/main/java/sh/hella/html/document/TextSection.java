package sh.hella.html.document;

/**
 * The type TextSection.
 */
public class TextSection extends Section {
    private final String text;
    private final Object[] args;

    /**
     * Instantiates a new TextSection.
     *
     * @param text the text
     */
    public TextSection(String text, Object... args) {
        this.text = text;
        this.args = args;
    }

    @Override
    public String toString() {
        String interpolated = text;
        for (Object arg : args) {
            if (arg == null) {
                continue;
            }
            interpolated = text.replaceFirst("\\{}", arg.toString());
        }
        return interpolated;
    }
}
