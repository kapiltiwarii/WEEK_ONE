import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingCharacter(String str) {
        int[] frequency = new int[256]; // Array to store frequency of characters (ASCII size)

        // Loop to count frequency of each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            frequency[currentChar]++; // Increment the count for the current character
        }

        // Loop through the string again to find the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (frequency[currentChar] == 1) { // If frequency is 1, it's non-repeating
                return currentChar; // Return the first non-repeating character
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the method to find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(inputString);

        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("There is no non-repeating character in the string.");
        }

      
    }
}