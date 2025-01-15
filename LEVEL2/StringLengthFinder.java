import java.util.Scanner;

public class StringLengthFinder {

    // Method to find the length of a string without using length() method
    public static int findLengthWithoutLengthMethod(String str) {
        int length = 0;
        try {
            // Loop through the string using charAt() until an exception occurs
            while (true) {
                str.charAt(length); // Attempt to access each character by index
                length++;           // Increment the length counter
            }
        } catch (IndexOutOfBoundsException e) {
            // Handle the exception when charAt() exceeds the string length
            // This is where the loop will terminate
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        // Calculate the length using the custom method
        int customLength = findLengthWithoutLengthMethod(userInput);

        // Calculate the length using the built-in length() method for comparison
        int builtInLength = userInput.length();

        // Display the results
        System.out.println("Length of the string (custom method): " + customLength);
        System.out.println("Length of the string (built-in method): " + builtInLength);
    }
}
