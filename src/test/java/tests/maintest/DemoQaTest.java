package tests.maintest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;


class DemoQaTest extends BaseTest {

    @Tag("positive")
    @Test ()
    @DisplayName("Проверка формы регистрации на сайте DemoQA. Позитивный сценарий")
    void testDemoQaTest() {
        demoQaPage.openPage()
                .setFirstName(dataTest.firstName)
                .setLastName(dataTest.lastName)
                .setEmail(dataTest.email)
                .setGender(dataTest.genders)
                .setMobile(dataTest.mobile)
                .setDateOfBirth(dataTest.dateOfBirthDay, dataTest.dateOfBirthMonth, dataTest.dateOfBirthYear)
                .setSubjects(dataTest.subject)
                .setHobbies(dataTest.hobby)
                .setPicture()
                .setAddress(dataTest.currentAddress)
                .setState(dataTest.state)
                .setCity(dataTest.city)
                .setSubmit();
        checkFormResultRegistration.checkResultRegistration("Student Name", dataTest.firstName + " " + dataTest.lastName)
                .checkResultRegistration("Student Email", dataTest.email)
                .checkResultRegistration("Gender", dataTest.genders)
                .checkResultRegistration("Mobile", dataTest.mobile)
                .checkResultRegistration("Date of Birth", dataTest.dateOfBirthDay + " " + dataTest.dateOfBirthMonth + "," + dataTest.dateOfBirthYear)
                .checkResultRegistration("Subjects", dataTest.subject)
                .checkResultRegistration("Hobbies", dataTest.hobby)
                .checkResultRegistration("Picture", "1.png")
                .checkResultRegistration("Address", dataTest.currentAddress)
                .checkResultRegistration("State and City", dataTest.state + " " + dataTest.city);
    }

    @Tag("minimal")
    @Test ()
    @DisplayName("Проверка формы регистрации на сайте DemoQA. Минимальные данные")
    void testDemoQaMinimalTest() {
        demoQaPage.openPage()
                .setMinimalFirstName("")
                .setMinimalLastName("")
                .setEmail(dataTest.email)
                .setGender(dataTest.genders)
                .setMinimalPhoneNumber("7")
                .setDateOfBirth(dataTest.dateOfBirthDay, dataTest.dateOfBirthMonth, dataTest.dateOfBirthYear)
                .setSubjects(dataTest.subject)
                .setHobbies(dataTest.hobby)
                .setPicture()
                .setAddress(dataTest.currentAddress)
                .setState(dataTest.state)
                .setCity(dataTest.city)
                .setSubmit()
                .checkMinimalFormRegistration();
    }

    @Tag("negative")
    @Test ()
    @DisplayName("Проверка формы регистрации на сайте DemoQA. Негативный сценарий")
    void testDemoQaNegativeTest() {
        demoQaPage.openPage()
                .setFirstName(dataTest.firstName)
                .setLastName(dataTest.lastName)
                .setInvalidEmail(dataTest.invalidEmail)
                .setGender(dataTest.genders)
                .setMobile(dataTest.mobile)
                .setDateOfBirth(dataTest.dateOfBirthDay, dataTest.dateOfBirthMonth, dataTest.dateOfBirthYear)
                .setSubjects(dataTest.subject)
                .setHobbies(dataTest.hobby)
                .setPicture()
                .setAddress(dataTest.currentAddress)
                .setState(dataTest.state)
                .setCity(dataTest.city)
                .setSubmit()
                .checkInvalidEmail();
    }

}