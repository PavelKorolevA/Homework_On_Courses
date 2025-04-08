package tests.shorttest;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Collections;


public class DataTest {

    Faker faker = new Faker();

    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String email = faker.internet().emailAddress();
    String invalidEmail = email.replace("@", "");

    String[]  genders = {"Male", "Female", "Other"};
    String randomGender = genders[faker.random().nextInt(genders.length)];

    String mobile = faker.phoneNumber().subscriberNumber(10);

    String userBirthYear = String.valueOf(faker.number().numberBetween(1924, 2010));
    String userBirthMonth = setRandomValue("January", "February", "March", "April", "May", "June", "July", "August",
            "September", "October", "November", "December");
    String userBirthDay = String.valueOf(faker.number().numberBetween(1,28));
    String subject = setRandomValue("English", "Math", "Physics", "Chemistry", "Computer Science");
    String hobby = setRandomValue("Sports", "Reading", "Music");
    String currentAddress = faker.address().streetAddress();
    String state = setRandomValue("Uttar Pradesh", "NCR", "Haryana", "Rajasthan");
    String city = setRandomCity(state);




    public String setRandomValue (String ... strings){
        ArrayList<String> values = new ArrayList<>();
        Collections.addAll(values,strings);
        String item = values.get(faker.number().numberBetween(0, values.size()-1));
        return item;
    }

    public String setRandomCity (String state) {
        return switch (state) {
            case "Uttar Pradesh" -> setRandomValue("Agra", "Lucknow", "Merrut");
            case "NCR" -> setRandomValue("Delhi", "Gurgaon", "Noida");
            case "Haryana" -> setRandomValue("Karnal", "Panipat");
            case "Rajasthan" -> setRandomValue("Jaipur", "Jaiselmer");
            default -> "";
        };
    }

}
