import java.util.Scanner;

public class CharacterFrequency3 {

    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequency(String text) {
        // Convert the string to a character array
        char[] characters = text.toCharArray();
        int length = characters.length;

        // Array to store frequency of characters
        int[] frequency = new int[length];

        // Array to store the characters and their frequencies
        String[] result = new String[length];
        
        // Outer loop to iterate through each character
        for (int i = 0; i < length; i++) {
            // If the character is not already counted (frequency is not 0)
            if (characters[i] != '0') {
                frequency[i] = 1;

                // Inner loop to count the frequency of the character
                for (int j = i + 1; j < length; j++) {
                    // If the character matches, increment the frequency and mark it as '0' to avoid counting it again
                    if (characters[i] == characters[j]) {
                        frequency[i]++;
                        characters[j] = '0'; // Set duplicate characters to '0'
                    }
                }

                // Store the character and its frequency in the result array
                result[i] = characters[i] + ": " + frequency[i];
            }
        }

        return result;
    }

    // Method to display the frequency of characters in a tabular format
    public static void displayFrequency(String[] result) {
        System.out.println("Character Frequency:");
        System.out.println("-----------------------------");
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("-----------------------------");

        for (String entry : result) {
            // Only print non-null entries (valid characters)
            if (entry != null) {
                System.out.println(entry);
            }
        }

        System.out.println("-----------------------------");
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find the character frequencies
        String[] frequencyResult = findCharacterFrequency(inputText);

        // Display the frequency of characters
        displayFrequency(frequencyResult);
    }
}
