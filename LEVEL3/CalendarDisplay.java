import java.util.Scanner;

public class CalendarDisplay {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to get the number of days in a month
    public static int getNumberOfDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // For February, check for leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7; // The day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        return d0;
    }

    // Method to display the calendar for a given month and year
    public static void displayCalendar(int month, int year) {
        int numDays = getNumberOfDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.println(getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for the first week to align the first day correctly
        int day = 1;
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // Four spaces to maintain proper alignment
        }

        // Print the days of the month
        for (int i = firstDay; i < 7; i++) {
            System.out.printf("%3d ", day++);
        }
        System.out.println();

        // Print the remaining weeks
        while (day <= numDays) {
            for (int i = 0; i < 7 && day <= numDays; i++) {
                System.out.printf("%3d ", day++);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take month and year as input from the user
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);

      
    }
}
