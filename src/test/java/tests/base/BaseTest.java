package tests.base;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.DemoQaPage;
import pages.components.CheckFormResultRegistration;
import tests.shorttest.DataTest;


public class BaseTest {

    public CheckFormResultRegistration checkFormResultRegistration = new CheckFormResultRegistration();
    public DemoQaPage demoQaPage = new DemoQaPage();
    public DataTest dataTest = new DataTest();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserPosition = "0x0";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
}
