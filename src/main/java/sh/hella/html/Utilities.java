package sh.hella.html;

import sh.hella.html.document.ElementSection;
import sh.hella.html.document.TextSection;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Utility methods.
 */
public interface Utilities {
    Map<String, TextSection> fileCache = new HashMap<>();
    Map<String, TextSection> resourceCache = new HashMap<>();

    /**
     * Returns the argued element section if the argued condition is true.
     *
     * @param condition The condition
     * @param whenTrue The element section to return when true
     * @return The element section if the condition was true, or {@code null}
     */
    static ElementSection when(boolean condition, ElementSection whenTrue) {
        return condition ? whenTrue : null;
    }

    /**
     * Returns one of the argued sections depending on the argued condition.
     *
     * @param condition The condition
     * @param whenTrue The element section to return when true
     * @param whenFalse The element section to return when false
     * @return the whenTrue element when true and the whenFalse element when false
     */
    static ElementSection when(boolean condition, ElementSection whenTrue, ElementSection whenFalse) {
        return condition ? whenTrue : whenFalse;
    }

    /**
     * From file to text section.
     *
     * @param filePath the file path
     * @param doCache whether to cache the result
     * @return the text section
     */
    static TextSection fromFile(String filePath, boolean doCache) {
        if (doCache && fileCache.containsKey(filePath)) {
            return fileCache.get(filePath);
        }
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            TextSection element = new TextSection(String.join("\n", lines));
            if (doCache) {
                fileCache.put(filePath, element);
            }
            return element;
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * From file to text section with caching enabled.
     *
     * @param filePath The file path
     * @return The text section
     */
    static TextSection fromFile(String filePath) {
        return fromFile(filePath, true);
    }

    /**
     * From resource to text section.
     *
     * @param resourcePath the resource path
     * @param doCache whether to cache the result
     * @return the text section
     */
    static TextSection fromResource(String resourcePath, boolean doCache) {
        if (doCache && resourceCache.containsKey(resourcePath)) {
            return resourceCache.get(resourcePath);
        }
        try {
            URL url = Objects.requireNonNull(Html.class.getClassLoader().getResource(resourcePath));
            List<String> lines = Files.readAllLines(Paths.get(url.toURI()));
            TextSection element = new TextSection(String.join("\n", lines));
            if (doCache) {
                resourceCache.put(resourcePath, element);
            }
            return element;
        } catch (IOException | URISyntaxException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * From resource to text section with caching enabled.
     *
     * @param resourcePath the resource path
     * @return The text section
     */
    static TextSection fromResource(String resourcePath) {
        return fromResource(resourcePath, true);
    }
}
