package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DemoQaPage extends BasePage{
    private final SelenideElement firstName = $("#firstName");
    private final SelenideElement lastName = $("#lastName");
    private final SelenideElement email = $("#userEmail");
    private final SelenideElement gender = $("#genterWrapper");
    private final SelenideElement mobile = $("#userNumber");
    private final SelenideElement subjects = $("#subjectsInput");
    private final SelenideElement hobbies = $x("//label[text()='Music']");
    private final SelenideElement picture = $("#uploadPicture");
    private final SelenideElement currentAddress = $("#currentAddress");
    private final SelenideElement state = $("#state");
    private final SelenideElement state2 = $x("//*[text()='NCR']");
    private final SelenideElement city = $("#city");
    private final SelenideElement city2 = $x("//*[text()='Delhi']");
    private final SelenideElement submit = $("#submit");

    CalendarComponent calendarComponent = new CalendarComponent();

    @Step("Open page")
    public DemoQaPage openPage() {
        open("/automation-practice-form");
        return this;
    }

    @Step("Set first name")
    public DemoQaPage setFirstName(String value) {
        firstName.setValue(value);
        return this;
    }

    @Step("Set minimal first name")
    public DemoQaPage setMinimalFirstName(String value) {
        firstName.setValue(value);
        return this;
    }

    @Step("Set last name")
    public DemoQaPage  setLastName(String value) {
        lastName.setValue(value);
        return this;
    }

    @Step("Set minimal last name")
    public DemoQaPage setMinimalLastName(String value) {
        lastName.setValue(value);
        return this;
    }

    @Step("Set email")
    public DemoQaPage setEmail(String value) {
        email.setValue(value);
        return this;
    }

    @Step("Set invalid email")
    public DemoQaPage setInvalidEmail(String value) {
        email.setValue(value);
        return this;
    }

    @Step("Set gender")
    public DemoQaPage setGender(String value) {
        gender.$(byText(value)).click();
        return this;
    }

    @Step("Set mobile")
    public DemoQaPage setMobile(String value) {
        mobile.setValue(value);
        return this;
    }

    @Step("Set minimal phone number")
    public DemoQaPage setMinimalPhoneNumber(String value) {
        mobile.setValue(value).pressEnter();
        return this;
    }

    @Step("Set date of birth")
    public DemoQaPage setDateOfBirth() {
        calendarComponent.setDate();
        return this;
    }

    @Step("Set subjects")
    public DemoQaPage setSubjects(String value) {
        subjects.setValue(value);
        return this;
    }

    @Step("Set hobbies")
    public DemoQaPage setHobbies() {
        hobbies.click();
        return this;
    }

    @Step("Set picture")
    public DemoQaPage setPicture() {
        picture.uploadFromClasspath("1.png");
        return this;
    }


    @Step("Set address")
    public DemoQaPage setAddress(String value) {
        currentAddress.setValue(value);
        return this;
    }

    @Step("Set state")
    public DemoQaPage setState() {
        state.click();
        state2.click();
        return this;
    }

    @Step("Set city")
    public DemoQaPage setCity() {
        city.click();
        city2.click();
        return this;
    }

    @Step("Set submit")
    public DemoQaPage setSubmit() {
        submit.click();
        return this;
    }

    @Step("Check minimal form registration")
    public void checkMinimalFormRegistration() {
        mobile.shouldHave(cssValue("border-color", "rgb(220, 53, 69)"));
        firstName.shouldHave(cssValue("border-color", "rgb(220, 53, 69)"));
        lastName.shouldHave(cssValue("border-color", "rgb(220, 53, 69)"));
    }

    @Step("Check invalid email")
    public void checkInvalidEmail() {
        email.shouldHave(cssValue("border-color", "rgb(220, 53, 69)"));
    }
}
