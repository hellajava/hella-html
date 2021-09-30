package sh.hella.html;

import sh.hella.html.element.TextElement;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface Inlining {
    Map<String, TextElement> fileCache = new HashMap<>();
    Map<String, TextElement> resourceCache = new HashMap<>();

    /**
     * From file to text element.
     *
     * @param filePath the file path
     * @param doCache whether or not to cache the result
     * @return the text element
     */
    static TextElement fromFile(String filePath, boolean doCache) {
        if (doCache && fileCache.containsKey(filePath)) {
            return fileCache.get(filePath);
        }
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            TextElement element = new TextElement(String.join("\n", lines));
            if (doCache) {
                fileCache.put(filePath, element);
            }
            return element;
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * From file to text element with caching enabled.
     *
     * @param filePath The file path
     * @return The text element
     */
    static TextElement fromFile(String filePath) {
        return fromFile(filePath, true);
    }

    /**
     * From resource to text element.
     *
     * @param resourcePath the resource path
     * @param doCache whether or not to cache the result
     * @return the text element
     */
    static TextElement fromResource(String resourcePath, boolean doCache) {
        if (doCache && resourceCache.containsKey(resourcePath)) {
            return resourceCache.get(resourcePath);
        }
        try {
            URL url = Objects.requireNonNull(Html.class.getClassLoader().getResource(resourcePath));
            List<String> lines = Files.readAllLines(Paths.get(url.toURI()));
            TextElement element = new TextElement(String.join("\n", lines));
            if (doCache) {
                resourceCache.put(resourcePath, element);
            }
            return element;
        } catch (IOException | URISyntaxException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * From resource to text element with caching enabled.
     *
     * @param resourcePath the resource path
     * @return The text element
     */
    static TextElement fromResource(String resourcePath) {
        return fromResource(resourcePath, true);
    }

}
