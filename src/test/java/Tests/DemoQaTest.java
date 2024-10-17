package Tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

class DemoQaTest {
    public String title = "//h1[@class='text-center']";
    public String firstName = "//input[@id='firstName']";
    public String lastName = "//input[@id='lastName']";
    public String email = "//input[@id='userEmail']";
    public String gender = "//input[@id='gender-radio-1']";
    public String mobile = "//input[@id='userNumber']";
    public String dateOfBirth = "//input[@id='dateOfBirthInput']";
    public String mounth = "//select[@class='react-datepicker__month-select']";
    public String year = "//select[@class='react-datepicker__year-select']";
    public String day = "//div[@class='react-datepicker__day react-datepicker__day--019']";
    public String subjects = "//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']";
    public String hobbies = "//input[@id='hobbies-checkbox-3']";
    public String picture = "//input[@id='uploadPicture']";
    public String currentAddress = "//textarea[@id='currentAddress']";
    public String state = "//div[@class=' css-1hwfws3']";
    public String city = "//div[@class='col-md-4 col-sm-12']";
    public String submit = "//button[@id='submit']";

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.headless = true;
    }

    @Test
    void testDemoQa() {
        open("/automation-practice-form");

        }
}