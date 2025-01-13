import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void generateException(String text) {
        int number = Integer.parseInt(text);  // This will generate NumberFormatException if the text is not a valid integer
        System.out.println("Parsed number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);  // This will generate NumberFormatException
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to parse as an integer: ");
        String userInput = scanner.next();

        System.out.println("\nDemonstrating exception generation:");
        try {
            generateException(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException in main: " + e.getMessage());
        }

        System.out.println("\nDemonstrating exception handling:");
        handleException(userInput);
    }
}
