package sh.hella.html;

import org.junit.jupiter.api.Test;
import sh.hella.html.document.Component;
import sh.hella.html.document.Section;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static sh.hella.html.Html.*;
import static sh.hella.html.Utilities.fromResource;

public class ComponentTest {

    public static class WelcomeComponent extends Component {
        public String name;

        @Override
        public Section render() {
            return div(span(text("Welcome, {}!", name)));
        }
    }

    @Test
    public void component_render_should_generate_expected_html() {
        final WelcomeComponent welcomeComponent = new WelcomeComponent();
        welcomeComponent.name = "Blake";

        final String actual = html(
            script(fromResource("hella.js")),
            body(welcomeComponent)
        ).toString();

        assertTrue(actual.startsWith("<!DOCTYPE html>"), "Starts with doctype");
        assertTrue(actual.contains("<html>"), "Contains HTML tag");
        assertTrue(actual.contains("function _hella_rpc"), "Contains inline JavaScript");
        assertTrue(actual.contains("<div data-uuid="), "Contains Component div with data-uuid attribute");
        assertTrue(actual.contains("<span>Welcome, " + welcomeComponent.name + "!</span>"), "Contains rendered model");
        assertTrue(actual.endsWith("</html>"), "Ends with closing html tag");
    }
}
