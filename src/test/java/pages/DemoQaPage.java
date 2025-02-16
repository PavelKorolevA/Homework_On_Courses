package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.textCaseSensitive;
import static com.codeborne.selenide.Selenide.*;

public class DemoQaPage {

    public DemoQaPage openPage() {
        open("https://demoqa.com/automation-practice-form");
        return this;
    }

    public static String firstName = "//input[@id='firstName']";
    public DemoQaPage setFirstName() {
        $x(firstName).sendKeys("Pavel");
        return this;
    }


    public static String lastName = "//input[@id='lastName']";
    public DemoQaPage  setLastName() {
        $x(lastName).setValue("Korolev");
        return this;
    }

    public static String email = "//input[@id='userEmail']";
    public DemoQaPage setEmail() {
        $x(email).setValue("pavel.korolev@gmail.com");
        return this;
    }

    public static String gender = "//label[text()='Male']";
    public DemoQaPage setGender() {
        $x(gender).click();
        return this;
    }

    public static String mobile = "//input[@id='userNumber']";
    public DemoQaPage setMobile() {
        $x(mobile).setValue("9261234567");
        return this;
    }

    public static String dateOfBirth = "//input[@id='dateOfBirthInput']";
    public static String mounth = "//select[@class='react-datepicker__month-select']";
    public static String year = "//select[@class='react-datepicker__year-select']";
    public static String day = "//div[@class='react-datepicker__day react-datepicker__day--019']";
    public DemoQaPage setDateOfBirth() {
        $x(dateOfBirth).click();
        $x(mounth).selectOption("November");
        $x(year).selectOption("1996");
        $x(day).click();
        return this;
    }

    public static String subjects = "//input[@id='subjectsInput']";
    public DemoQaPage setSubjects() {
        $x(subjects).setValue("Biology, Chemistry");
        return this;
    }

    public static String hobbies = "//label[text()='Music']";
    public DemoQaPage setHobbies() {
        $x(hobbies).click();
        return this;
    }

    public static String picture = "//input[@id='uploadPicture']";
    public DemoQaPage setPicture() {
        $x(picture).uploadFromClasspath("1.png");
        return this;
    }


    public static String currentAddress = "//textarea[@id='currentAddress']";
    public DemoQaPage setAddress() {
        $x(currentAddress).setValue("Samara");
        return this;
    }


    public static String state = "//div[@id='state']";
    public static String state2 = "//*[text()='NCR']";
    public DemoQaPage setState() {
        $x(state).click();
        $x(state2).click();
        return this;
    }


    public static String city = "//div[@id='city']";
    public static String city2 = "//*[text()='Delhi']";
    public DemoQaPage setCity() {
        $x(city).click();
        $x(city2).click();
        return this;
    }


    public static String submit = "//button[@id='submit']";
    public DemoQaPage setSubmit() {
        $x(submit).click();
        return this;
    }

    public DemoQaPage checkFormRegistration() {
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
        return this;
    }
}
