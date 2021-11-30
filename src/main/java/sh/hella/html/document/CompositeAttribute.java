package sh.hella.html.document;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * The type Composite attribute section.
 */
public class CompositeAttribute extends Attribute {

    /**
     * Instantiates a new CompositeAttributeSection.
     *
     * @param sections the sections
     */
    public CompositeAttribute(Attribute... sections) {
        super("", "");
        this.sections().addAll(Arrays.asList(sections));
    }

    @Override
    public String toString() {
        return sections().stream()
                .map(Objects::toString)
                .collect(Collectors.joining(" "));
    }
}
