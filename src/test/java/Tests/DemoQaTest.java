package Tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;


import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

class DemoQaTest {
    public String title = "//h1[@class='text-center']";
    public String firstName = "//input[@id='firstName']";
    public String lastName = "//input[@id='lastName']";
    public String email = "//input[@id='userEmail']";
    public String gender = "//label[text()='Male']";
    public String mobile = "//input[@id='userNumber']";
    public String dateOfBirth = "//input[@id='dateOfBirthInput']";
    public String mounth = "//select[@class='react-datepicker__month-select']";
    public String year = "//select[@class='react-datepicker__year-select']";
    public String day = "//div[@class='react-datepicker__day react-datepicker__day--019']";
    public String subjects = "//input[@id='subjectsInput']";
    public String hobbies = "//label[text()='Music']";
    public String picture = "//input[@id='uploadPicture']";
    public String currentAddress = "//textarea[@id='currentAddress']";
    public String state = "//div[@id='state']";
    public String state2 = "//*[text()='NCR']";
    public String city = "//div[@id='city']";
    public String city2 = "//*[text()='Delhi']";
    public String submit = "//button[@id='submit']";

//    @BeforeAll
//    static void beforeAll() {
//        Configuration.browserSize = "1920x1080";
//        Configuration.timeout = 10000;
//        Configuration.baseUrl = "https://demoqa.com";
//        Configuration.headless = true;
//    }

    @Test
    void testDemoQa() {
        open("https://demoqa.com/automation-practice-form");
        $x(firstName).setValue("Pavel");
        $x(lastName).setValue("Korolev");
        $x(email).setValue("pavel.korolev@gmail.com");
        $x(gender).click();
        $x(mobile).setValue("9261234567");
        $x(dateOfBirth).click();
        $x(mounth).selectOption("November");
        $x(year).selectOption("1996");
        $x(day).click();
        $x(subjects).setValue("Biology, Chemistry");
        $x(hobbies).click();
        $x(picture).uploadFromClasspath("1.png");
        $x(currentAddress).setValue("Samara");
        $x(state).click();
        $x(state2).click();
        $x(city).click();
        $x(city2).click();
        $x(submit).click();

        $x("//div[@class='modal-header']").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(
                textCaseSensitive("Student Name"),    textCaseSensitive("Pavel Korolev"),
                textCaseSensitive("Student Email"),   textCaseSensitive("pavel.korolev@gmail.com"),
                textCaseSensitive("Gender"),          textCaseSensitive("Male"),
                textCaseSensitive("Mobile"),          textCaseSensitive("9261234567"),
                textCaseSensitive("Date of Birth"),   textCaseSensitive("19 November,1996"),
                textCaseSensitive("Subjects"),        textCaseSensitive(" "),
                textCaseSensitive("Hobbies"),         textCaseSensitive("Music"),
                textCaseSensitive("Picture"),         textCaseSensitive("1.png"),
                textCaseSensitive("Address"),         textCaseSensitive("Samara"),
                textCaseSensitive("State and City"),  textCaseSensitive("NCR Delhi")
                );
    }

}