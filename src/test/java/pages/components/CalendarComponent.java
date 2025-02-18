package pages.components;
import pages.DemoQaPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class CalendarComponent {
    public void setDate() {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $$("[value=\"10\"]").findBy(text("November")).click();
        $(".react-datepicker__year-select").click();
        $$("[value=\"1996\"]").findBy(text("1996")).click();
        $(".react-datepicker__day--019").click();
    }
}
