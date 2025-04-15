package tests.shorttest;

import com.github.javafaker.Faker;


public class DataTest {

    Faker faker = new Faker();

    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String email = faker.internet().emailAddress();
    public String invalidEmail = email.replace("@", "");

    public String genders = faker.options().option("Male", "Female", "Other");
    public String mobile = faker.phoneNumber().subscriberNumber(10);
    public String dateOfBirthDay = String.valueOf(faker.number().numberBetween(1,28));
    public String dateOfBirthMonth = faker.options().option("January", "February", "March", "April", "May",
            "June", "July", "August", "September", "October", "November", "December");
    public String dateOfBirthYear = String.valueOf(faker.number().numberBetween(1990,2005));

    public String subject = faker.options().option("English", "Math", "Physics", "Chemistry", "Computer Science");
    public String hobby =faker.options().option("Sports", "Reading", "Music");
    public String currentAddress = faker.address().streetAddress();
    public String state = faker.options().option("Uttar Pradesh", "NCR", "Haryana", "Rajasthan");
    public String city = setRandomCity(state);

    public String setRandomCity (String state) {
        return switch (state) {
            case "Uttar Pradesh" -> faker.options().option("Agra", "Lucknow", "Merrut");
            case "NCR" -> faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Haryana" -> faker.options().option("Karnal", "Panipat");
            case "Rajasthan" -> faker.options().option("Jaipur", "Jaiselmer");
            default -> "";
        };
    }
}
