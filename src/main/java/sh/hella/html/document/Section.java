package sh.hella.html.document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * An composable section of an HTML document - elements, attributes, text, etc.
 */
public class Section {
    private final transient List<Section> sections;

    /**
     * Instantiates a new Section.
     *
     * @param sections The children sections
     */
    public Section(Section... sections) {
        this.sections = new ArrayList<>(Arrays.asList(sections));
    }

    @Override
    public String toString() {
        return sections.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
    }

    /**
     * Get child sections.
     *
     * @return the child sections
     */
    public List<Section> sections() {
        return sections;
    }

    /**
     * Add sections.
     *
     * @param sections the children
     * @return the node
     */
    public Section add(Collection<Section> sections) {
        sections().addAll(sections);
        return this;
    }

    /**
     * Add sections.
     *
     * @param sections the sections
     * @return the section
     */
    public Section add(Section... sections) {
        return add(Arrays.asList(sections));
    }

    /**
     * Remove sections.
     *
     * @param sections the sections
     * @return the section
     */
    public Section remove(Collection<Section> sections) {
        sections().removeAll(sections);
        return this;
    }

    /**
     * Remove sections.
     *
     * @param sections the sections
     * @return the section
     */
    public Section remove(Section... sections) {
        return remove(Arrays.asList(sections));
    }
}
