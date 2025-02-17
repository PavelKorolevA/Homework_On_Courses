package tests.shorttest;

import org.junit.jupiter.api.Test;
import pages.DemoQaPage;

class DemoQaTest extends DemoQaPage {

    DemoQaPage demoQaPage = new DemoQaPage();

    @Test
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
                .checkFormRegistration();
    }

}