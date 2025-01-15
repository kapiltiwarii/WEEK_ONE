import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {
// Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        char ch = text.charAt(text.length());
        System.out.println("Character at out-of-bound index: " + ch);
    }
// Method to demonstrate StringIndexOutOfBoundsException handling

    public static void handleException(String text) {
        try {
            char ch = text.charAt(text.length());
            System.out.println("Character at out-of-bound index: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught a StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.next();
      // Calling the method that generates the exception
        System.out.println("\nDemonstrating exception generation:");
        try {
            generateException(userInput);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught a StringIndexOutOfBoundsException in main: " + e.getMessage());
        }

        // Calling the method that handles the exception

        System.out.println("\nDemonstrating exception handling:");
        handleException(userInput);
    }
}
