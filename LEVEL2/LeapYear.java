
import java.util.*;

public class LeapYear {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Check if the year is divisible by 4 but not divisible by 100, or divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take the year from the user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Validate if the year is >= 1582
        if (year < 1582) {
            System.out.println("The year must be greater than or equal to 1582. Exiting.");
            return;
        }

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println("The year " + year + " is a Leap Year.");
        } else {
            System.out.println("The year " + year + " is not a Leap Year.");
        }

    }
}
