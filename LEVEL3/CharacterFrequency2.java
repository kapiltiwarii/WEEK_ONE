import java.util.Scanner;

public class CharacterFrequency2 {

    // Method to find the unique characters in a string
    public static char[] uniqueCharacters(String text) {
        // Find the length of the text
        int length = text.length();
        
        // Create a boolean array to track if a character is already present
        boolean[] visited = new boolean[256]; // ASCII size is 256
        int uniqueCount = 0;

        // Count unique characters
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            if (!visited[currentChar]) {
                visited[currentChar] = true;
                uniqueCount++;
            }
        }

        // Create an array to store the unique characters
        char[] uniqueChars = new char[uniqueCount];
        int index = 0;

        // Store unique characters in the result array
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            if (visited[currentChar]) {
                visited[currentChar] = false; // Mark this character as already added
                uniqueChars[index++] = currentChar;
            }
        }

        return uniqueChars;
    }

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        // Array to store frequency of each character (256 for ASCII characters)
        int[] frequency = new int[256];

        // Calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Call uniqueCharacters to get the unique characters in the text
        char[] uniqueChars = uniqueCharacters(text);

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Store the unique characters and their frequencies in the result array
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;
    }

    // Method to display the frequency results in a tabular format
    public static void displayFrequency(String[][] result) {
        System.out.println("Character Frequency:");
        System.out.println("-----------------------------");
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("-----------------------------");

        for (String[] entry : result) {
            System.out.printf("%-10s %-10s%n", entry[0], entry[1]);
        }

        System.out.println("-----------------------------");
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find the character frequencies
        String[][] frequencyResult = findCharacterFrequency(inputText);

        // Display the frequency of characters
        displayFrequency(frequencyResult);
    }
}
