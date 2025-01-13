import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void generateException(String text) {
        String result = text.substring(5, 2);  // start index greater than end index
        System.out.println("Substring: " + result);
    }

    public static void handleException(String text) {
        try {
            String result = text.substring(5, 2);  // start index greater than end index
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        System.out.println("\nDemonstrating exception generation:");
        try {
            generateException(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException in main: " + e.getMessage());
        }

        System.out.println("\nDemonstrating exception handling:");
        handleException(userInput);
    }
}
