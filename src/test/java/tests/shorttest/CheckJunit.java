package tests.shorttest;

import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class CheckJunit {

    @Test
    public void checkForTheAvailabilityOfJunit() {
        open("https://github.com/selenide/selenide");
        $("[data-content='Wiki']").click();
        $$("ul.internal present").findBy(text("Soft assertions"));
        $("[href=\"/selenide/selenide/wiki/SoftAssertions\"]").click();
        $$("h4.heading-element").findBy(text("Using JUnit5 extend test class:"));
        $$("div.highlight highlight-source-java notranslate position-relative overflow-auto").findBy(text(
                "@ExtendWith({SoftAssertsExtension.class})\n" +
                        "class Tests {\n" +
                        "  @Test\n" +
                        "  void test() {\n" +
                        "    Configuration.assertionMode = SOFT;\n" +
                        "    open(\"page.html\");\n" +
                        "\n" +
                        "    $(\"#first\").should(visible).click();\n" +
                        "    $(\"#second\").should(visible).click();\n" +
                        "  }\n" +
                        "}"
        ));
    }
}
