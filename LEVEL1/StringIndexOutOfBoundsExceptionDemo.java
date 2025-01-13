import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

    public static void generateException(String text) {
        char ch = text.charAt(text.length());
        System.out.println("Character at out-of-bound index: " + ch);
    }

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

        System.out.println("\nDemonstrating exception generation:");
        try {
            generateException(userInput);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught a StringIndexOutOfBoundsException in main: " + e.getMessage());
        }

        System.out.println("\nDemonstrating exception handling:");
        handleException(userInput);
    }
}
