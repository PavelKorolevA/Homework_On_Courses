package tests.shorttest;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.DemoQaPage;

class DemoQaTest extends DemoQaPage {
    DemoQaPage demoQaPage = new DemoQaPage();
    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Tag("positive")
    @Test ()
    @DisplayName("Проверка формы регистрации на сайте DemoQA. Позитивный сценарий")
    void testDemoQaTest() {
        demoQaPage.openPage()
                .setFirstName()
                .setLastName()
                .setEmail()
                .setGender()
                .setMobile()
                .setDateOfBirth()
                .setSubjects()
                .setHobbies()
                .setPicture()
                .setAddress()
                .setState()
                .setCity()
                .setSubmit()
                .setCheckFormRegistration();
    }

    @Tag("minimal")
    @Test ()
    @DisplayName("Проверка формы регистрации на сайте DemoQA. Минимальные данные")
    void testDemoQaMinimalTest() {
        demoQaPage.openPage()
                .setMinimalFirstName()
                .setMinimalLastName()
                .setEmail()
                .setGender()
                .setMinimalPhoneNumber()
                .setDateOfBirth()
                .setSubjects()
                .setHobbies()
                .setPicture()
                .setAddress()
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
                .setFirstName()
                .setLastName()
                .setInvalidEmail()
                .setGender()
                .setMobile()
                .setDateOfBirth()
                .setSubjects()
                .setHobbies()
                .setPicture()
                .setAddress()
                .setState()
                .setCity()
                .setSubmit()
                .checkInvalidEmail();
    }

}