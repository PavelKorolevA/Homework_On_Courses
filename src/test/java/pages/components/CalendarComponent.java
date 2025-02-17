package pages.components;
import pages.DemoQaPage;

import static com.codeborne.selenide.Selenide.*;

public class CalendarComponent {
    public void setDate() {
        $("#dateOfBirthInput");
        $(".react-datepicker__month-select");
        $(".react-datepicker__year-select");
        $(".react-datepicker__day react-datepicker__day--019");
    }
}
