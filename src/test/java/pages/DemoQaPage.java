package pages;

import io.qameta.allure.Step;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.textCaseSensitive;
import static com.codeborne.selenide.Selenide.*;

public class DemoQaPage {
    public static String firstName = "//input[@id='firstName']";
    public static String lastName = "//input[@id='lastName']";
    public static String email = "//input[@id='userEmail']";
    public static String gender = "//label[text()='Male']";
    public static String mobile = "//input[@id='userNumber']";
    public static String subjects = "//input[@id='subjectsInput']";
    public static String hobbies = "//label[text()='Music']";
    public static String picture = "//input[@id='uploadPicture']";
    public static String currentAddress = "//textarea[@id='currentAddress']";
    public static String state = "//div[@id='state']";
    public static String state2 = "//*[text()='NCR']";
    public static String city = "//div[@id='city']";
    public static String city2 = "//*[text()='Delhi']";
    public static String submit = "//button[@id='submit']";
    CalendarComponent calendarComponent = new CalendarComponent();


    @Step("Open page")
    public DemoQaPage openPage() {
        open("https://demoqa.com/automation-practice-form");
        return this;
    }

    @Step("Set first name")
    public DemoQaPage setFirstName() {
        $x(firstName).sendKeys("Pavel");
        return this;
    }

    @Step("Set last name")
    public DemoQaPage  setLastName() {
        $x(lastName).setValue("Korolev");
        return this;
    }

    @Step("Set email")
    public DemoQaPage setEmail() {
        $x(email).setValue("pavel.korolev@gmail.com");
        return this;
    }

    @Step("Set gender")
    public DemoQaPage setGender() {
        $x(gender).click();
        return this;
    }

    @Step("Set mobile")
    public DemoQaPage setMobile() {
        $x(mobile).setValue("9261234567");
        return this;
    }

    @Step("Set date of birth")
    public DemoQaPage setDateOfBirth() {
        calendarComponent.setDate();
        return this;
    }

    @Step("Set subjects")
    public DemoQaPage setSubjects() {
        $x(subjects).setValue("Biology, Chemistry");
        return this;
    }

    @Step("Set hobbies")
    public DemoQaPage setHobbies() {
        $x(hobbies).click();
        return this;
    }

    @Step("Set picture")
    public DemoQaPage setPicture() {
        $x(picture).uploadFromClasspath("1.png");
        return this;
    }


    @Step("Set address")
    public DemoQaPage setAddress() {
        $x(currentAddress).setValue("Samara");
        return this;
    }

    @Step("Set state")
    public DemoQaPage setState() {
        $x(state).click();
        $x(state2).click();
        return this;
    }

    @Step("Set city")
    public DemoQaPage setCity() {
        $x(city).click();
        $x(city2).click();
        return this;
    }

    @Step("Set submit")
    public DemoQaPage setSubmit() {
        $x(submit).click();
        return this;
    }

    @Step("Check form registration")
    public void checkFormRegistration() {
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
