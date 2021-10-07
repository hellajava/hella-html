package sh.hella.html;

import org.junit.jupiter.api.Test;
import sh.hella.html.document.ElementSection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static sh.hella.html.Html.a;
import static sh.hella.html.Html.attr;
import static sh.hella.html.Html.body;
import static sh.hella.html.Html.button;
import static sh.hella.html.Html.div;
import static sh.hella.html.Html.head;
import static sh.hella.html.Html.href;
import static sh.hella.html.Html.html;
import static sh.hella.html.Html.onclick;
import static sh.hella.html.Html.p;
import static sh.hella.html.Html.script;
import static sh.hella.html.Html.text;
import static sh.hella.html.Html.title;
import static sh.hella.html.Utilities.fromResource;

public class HtmlTest {

    @Test
    public void onclick_should_generate_expected_html() {
        final String actual = html(
            script(fromResource("hella.js")),
            body(
                div(
                    button(onclick((event) -> System.out.println("Button was clicked")))
                )
            )
        ).toString();

        assertTrue(actual.startsWith("<!DOCTYPE html>"), "Starts with doctype");
        assertTrue(actual.contains("<html>"), "Contains html tag");
        assertTrue(actual.contains("<script>"), "Contains script tag");
        assertTrue(actual.contains("function _hella_rpc"), "Contains inline JavaScript");
        assertTrue(actual.contains("onclick=\"_hella_rpc"), "Contains RPC onclick handler");
        assertFalse(actual.contains("Button was clicked"), "Does not contain serverside RPC handler logic");
        assertTrue(actual.endsWith("</html>"), "Ends with closing html tag");
    }

    @Test
    public void testPage_toString_should_generate_expected_html() {
        String actual = html(
            head(
                title(text("Hello World Test")),
                script(text("alert('hello world');"))
            ),
            body(
                div(attr("custom", "Test worked"),
                    p(text("Hello, world! Please "), a(text("visit us"), href("https://google.com")), text(" at our website."))
                )
            )
        ).toString();

        assertTrue(actual.startsWith("<!DOCTYPE html>"), "Starts with doctype");
        assertTrue(actual.contains("<html>"), "Contains html tag");
        assertTrue(actual.contains("<script>"), "Contains script tag");
        assertTrue(actual.contains("alert('hello world');"), "Contains inline JavaScript");
        assertTrue(actual.contains("Hello, world!"), "Contains Hello World");
        assertTrue(actual.endsWith("</html>"), "Ends with closing html tag");
    }

}
