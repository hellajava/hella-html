package sh.hella.html.document;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * The type Composite attribute section.
 */
public class CompositeAttributeSection extends AttributeSection {

    /**
     * Instantiates a new CompositeAttributeSection.
     *
     * @param sections the sections
     */
    public CompositeAttributeSection(AttributeSection... sections) {
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
