import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Example usage of the CalendarToNewDateAdapter
        Calendar calendar = Calendar.getInstance();
        NewDateInterface newDate = new CalendarToNewDateAdapter(calendar);

        // Set a date
        newDate.setYear(2023);
        newDate.setMonth(10);
        newDate.setDay(5);

        // Print the date
        System.out.println("Date: " + newDate.getDay() + "/" + newDate.getMonth() + "/" + newDate.getYear());

        // Advance the date by 10 days
        newDate.advanceDays(10);
        System.out.println("New Date after advancing 10 days: " + newDate.getDay() + "/" + newDate.getMonth() + "/" + newDate.getYear());
    }
}
