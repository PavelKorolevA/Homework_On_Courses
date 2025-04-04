package pages;

import io.qameta.allure.Step;
import pages.components.CalendarComponent;
import pages.components.CheckFormResultRegistration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class DemoQaPage extends BasePage{
    public static String
    firstName = "//input[@id='firstName']",
    lastName = "//input[@id='lastName']",
    email = "//input[@id='userEmail']",
    gender = "//label[text()='Male']",
    mobile = "//input[@id='userNumber']",
    subjects = "//input[@id='subjectsInput']",
    hobbies = "//label[text()='Music']",
    picture = "//input[@id='uploadPicture']",
    currentAddress = "//textarea[@id='currentAddress']",
    state = "//div[@id='state']",
    state2 = "//*[text()='NCR']",
    city = "//div[@id='city']",
    city2 = "//*[text()='Delhi']",
    submit = "//button[@id='submit']";

    CalendarComponent calendarComponent = new CalendarComponent();
    CheckFormResultRegistration checkFormResultRegistration = new CheckFormResultRegistration();

    @Step("Open page")
    public DemoQaPage openPage() {
        open("/automation-practice-form");
        return this;
    }

    @Step("Set first name")
    public DemoQaPage setFirstName() {
        $x(firstName).sendKeys("Pavel");
        return this;
    }

    @Step("Set minimal first name")
    public DemoQaPage setMinimalFirstName() {
        $x(firstName).sendKeys("");
        return this;
    }

    @Step("Set last name")
    public DemoQaPage  setLastName() {
        $x(lastName).sendKeys("Korolev");
        return this;
    }

    @Step("Set minimal last name")
    public DemoQaPage setMinimalLastName() {
        $x(lastName).sendKeys("");
        return this;
    }

    @Step("Set email")
    public DemoQaPage setEmail() {
        $x(email).setValue("pavel.korolev@gmail.com");
        return this;
    }

    @Step("Set invalid email")
    public DemoQaPage setInvalidEmail() {
        $x(email).setValue("ru.ru");
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

    @Step("Set minimal phone number")
    public DemoQaPage setMinimalPhoneNumber() {
        $x(mobile).setValue("8").pressEnter();
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
    public void setCheckFormRegistration() {
       checkFormResultRegistration.checkResultRegistration();
    }

    @Step("Check minimal form registration")
    public void checkMinimalFormRegistration() {
        $x(mobile).shouldHave(cssValue("border-color", "rgb(220, 53, 69)"));
        $x(firstName).shouldHave(cssValue("border-color", "rgb(220, 53, 69)"));
        $x(lastName).shouldHave(cssValue("border-color", "rgb(220, 53, 69)"));
    }

    @Step("Check invalid email")
    public void checkInvalidEmail() {
        $x(email).shouldHave(cssValue("border-color", "rgb(220, 53, 69)"));
    }
}
