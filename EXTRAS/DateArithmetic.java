import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        // Take a sample date (input date)
        LocalDate date = LocalDate.of(2023, 1, 15);  // Example date

        // Add 7 days, 1 month, and 2 years
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("Date after adding 7 days, 1 month, and 2 years: " + newDate);

        // Subtract 3 weeks
        LocalDate finalDate = newDate.minusWeeks(3);
        System.out.println("Date after subtracting 3 weeks: " + finalDate);
    }
}
