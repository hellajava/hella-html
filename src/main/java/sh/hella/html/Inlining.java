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
     * From file to text node.
     *
     * @param filePath the file path
     * @param doCache whether or not to cache the result
     * @return the string
     */
    static TextElement fromFile(String filePath, boolean doCache) {
        if (doCache && fileCache.containsKey(filePath)) {
            return fileCache.get(filePath);
        }
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            TextElement node = new TextElement(String.join("\n", lines));
            if (doCache) {
                fileCache.put(filePath, node);
            }
            return node;
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * From file to text node with caching enabled.
     *
     * @param filePath The file path
     * @return The text node
     */
    static TextElement fromFile(String filePath) {
        return fromFile(filePath, true);
    }

    /**
     * From resource to text node.
     *
     * @param resourcePath the resource path
     * @param doCache whether or not to cache the result
     * @return the string
     */
    static TextElement fromResource(String resourcePath, boolean doCache) {
        if (doCache && resourceCache.containsKey(resourcePath)) {
            return resourceCache.get(resourcePath);
        }
        try {
            URL url = Objects.requireNonNull(Html.class.getClassLoader().getResource(resourcePath));
            List<String> lines = Files.readAllLines(Paths.get(url.toURI()));
            TextElement node = new TextElement(String.join("\n", lines));
            if (doCache) {
                resourceCache.put(resourcePath, node);
            }
            return node;
        } catch (IOException | URISyntaxException ex) {
            throw new RuntimeException(ex);
        }
    }

    static TextElement fromResource(String resourcePath) {
        return fromResource(resourcePath, true);
    }

}
