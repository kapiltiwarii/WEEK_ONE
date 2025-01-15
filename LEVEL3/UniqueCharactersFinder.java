import java.util.Scanner;

public class UniqueCharactersFinder {

    // Method to calculate the length of a string without using length() method
    public static int calculateLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached the end of the string
        }
        return length;
    }

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = calculateLength(text);
        char[] tempUnique = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the current character is already in the unique list
            for (int j = 0; j < uniqueCount; j++) {
                if (tempUnique[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                tempUnique[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create an array to store only the unique characters
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempUnique[i];
        }

        return uniqueChars;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(inputText);

        // Display the unique characters
        System.out.println("Unique Characters in the string:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
    }
}
