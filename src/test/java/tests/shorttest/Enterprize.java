package tests.shorttest;

import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Enterprize {
    @Test
    public void checkLoadingPageTest () {
        open("https://github.com");
        $$(".HeaderMenu-nav li").findBy(text("Solutions")).hover();
        $("[href=\"https://github.com/enterprise\"]").hover().click();
        $(".enterprise-hero-background").shouldHave(text("The AI-powered developer platform"));
    }
}
