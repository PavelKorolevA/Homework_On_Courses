package tests.shorttest;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.DemoQaPage;

class DemoQaTest extends DemoQaPage {
    DemoQaPage demoQaPage = new DemoQaPage();
    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void testDemoQa() {
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
                .checkFormRegistration();
    }

}