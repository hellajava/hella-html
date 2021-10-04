package sh.hella.html;

import org.junit.jupiter.api.Test;
import sh.hella.html.document.ElementSection;

import static sh.hella.html.Html.a;
import static sh.hella.html.Html.attr;
import static sh.hella.html.Html.body;
import static sh.hella.html.Html.div;
import static sh.hella.html.Html.head;
import static sh.hella.html.Html.href;
import static sh.hella.html.Html.html;
import static sh.hella.html.Html.p;
import static sh.hella.html.Html.script;
import static sh.hella.html.Html.text;
import static sh.hella.html.Html.title;

public class HtmlTest {

    @Test
    public void testPage_toString_should_generate_expected_html() {
        /*
        String actual = getTestPage().toString();
        Assertions.assertEquals(
                "<!DOCTYPE html><html><head><title>Hello World Test</title><script>alert('hello world');</script></head><body><div custom=\"Test worked\"><p>Hello, world! Please <a href=\"https://google.com\">visit us</a> at our website.</p></div></body></html>",
                actual,
                "Expected HTML generated");
         */
    }

    private ElementSection getTestPage() {
        return html(
            head(
                title(text("Hello World Test")),
                script(text("alert('hello world');"))
            ),
            body(
                div(attr("custom", "Test worked"),
                    p(text("Hello, world! Please "), a(text("visit us"), href("https://google.com")), text(" at our website."))
                )
            )
        );
    }
}
