package sh.hella.html;

import org.junit.jupiter.api.Test;
import sh.hella.html.document.Model;
import sh.hella.html.document.Section;
import static sh.hella.html.Html.*;
import static sh.hella.html.Utilities.*;

public class ModelTest {

    public static class TestModel extends Model<TestModel> {
        public String testString = "Test Button has not been clicked";
        public boolean testSucceeded = false;

        @Override
        public Section render() {
            return div(
                input(id("test-field"), type("text")),
                span(text("Test string: " + testString)),
                when(testSucceeded, span(text("Test succeeded!"))),
                button(
                    text("Test Button"),
                    onclick(updateState((testModel) -> {
                        testModel.testString = valueOf("test-field");
                        testModel.testSucceeded = true;
                    }))
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
