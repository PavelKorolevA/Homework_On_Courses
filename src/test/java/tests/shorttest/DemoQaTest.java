package tests.shorttest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.DemoQaPage;
import pages.components.CheckFormResultRegistration;
import tests.base.BaseTest;


class DemoQaTest extends BaseTest {

    CheckFormResultRegistration checkFormResultRegistration = new CheckFormResultRegistration();
    DemoQaPage demoQaPage = new DemoQaPage();

    @Tag("positive")
    @Test ()
    @DisplayName("Проверка формы регистрации на сайте DemoQA. Позитивный сценарий")
    void testDemoQaTest() {
        demoQaPage.openPage()
                .setFirstName("Pavel")
                .setLastName("Korolev")
                .setEmail("pavel.korolev@gmail.com")
                .setGender("Male")
                .setMobile("9261234567")
                .setDateOfBirth()
                .setSubjects("Biology, Chemistry")
                .setHobbies()
                .setPicture()
                .setAddress("Samara")
                .setState()
                .setCity()
                .setSubmit();
        checkFormResultRegistration.checkResultRegistration("Student Name", "Pavel Korolev")
                .checkResultRegistration("Student Email", "pavel.korolev@gmail.com")
                .checkResultRegistration("Gender", "Male")
                .checkResultRegistration("Mobile", "9261234567")
                .checkResultRegistration("Date of Birth", "19 November,1996")
                .checkResultRegistration("Subjects", " ")
                .checkResultRegistration("Hobbies", "Music")
                .checkResultRegistration("Picture", "1.png")
                .checkResultRegistration("Address", "Samara")
                .checkResultRegistration("State and City", "NCR Delhi");
    }

    @Tag("minimal")
    @Test ()
    @DisplayName("Проверка формы регистрации на сайте DemoQA. Минимальные данные")
    void testDemoQaMinimalTest() {
        demoQaPage.openPage()
                .setMinimalFirstName("")
                .setMinimalLastName("")
                .setEmail("pavel.korolev@gmail.com")
                .setGender("Male")
                .setMinimalPhoneNumber("7")
                .setDateOfBirth()
                .setSubjects("Biology, Chemistry")
                .setHobbies()
                .setPicture()
                .setAddress("Samara")
                .setState()
                .setCity()
                .setSubmit()
                .checkMinimalFormRegistration();
    }

    @Tag("negative")
    @Test ()
    @DisplayName("Проверка формы регистрации на сайте DemoQA. Негативный сценарий")
    void testDemoQaNegativeTest() {
        demoQaPage.openPage()
                .setFirstName("Pavel")
                .setLastName("Korolev")
                .setInvalidEmail("ru.ru")
                .setGender("Male")
                .setMobile("9261234567")
                .setDateOfBirth()
                .setSubjects("Biology, Chemistry")
                .setHobbies()
                .setPicture()
                .setAddress("Samara")
                .setState()
                .setCity()
                .setSubmit()
                .checkInvalidEmail();
    }

}