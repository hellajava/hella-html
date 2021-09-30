package sh.hella.html;

import org.junit.jupiter.api.Test;
import sh.hella.html.element.Element;
import sh.hella.html.element.Model;

import static sh.hella.html.Html.*;
import static sh.hella.html.Inlining.*;

public class ModelTest {

    public static class TestModel extends Model {
        public String testString = "Test Button has not been clicked";
        public boolean testSucceeded = false;

        @Override
        public Element render() {
            return elements(
                span(text("Test string: " + testString)),
                span(text("Succeeded: " + testSucceeded)),
                button(
                    onclick(updateState(() -> {
                        testString = "Test Button has been clicked";
                        testSucceeded = true;
                    })),
                    text("Test Button")
                )
            );
        }
    }

    @Test
    public void model_onClick_setState_should_generate_correct_output() {
        final String document = html(
            script(fromResource("hella.js")),
            body(new TestModel())
        ).toString();

        System.out.println(document); // TODO: a real assertion
    }

}
