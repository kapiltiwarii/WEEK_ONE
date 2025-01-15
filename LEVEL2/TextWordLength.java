import java.util.Scanner;

public class TextWordLengthHuman {

    // Method to find the length of a string without using the built-in length() method
    public static int calculateStringLength(String str) {
        int length = 0;
        try {
            while (true) {
                // Try accessing the character at the current index
                str.charAt(length);
                length++; // Increment the length counter
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception caught when index goes out of bounds, indicating the end of the string
        }
        return length;
    }

    // Method to split the input text into words using charAt() without using the split() method
    public static String[] splitTextIntoWords(String text) {
        int length = calculateStringLength(text);
        int wordCount = 1; // Start with one word

        // Count the number of spaces to determine the number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Array to store the words
        String[] words = new String[wordCount];
        StringBuilder currentWord = new StringBuilder();
        int wordIndex = 0;

        // Traverse the text and build words character by character
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            if (currentChar != ' ') {
                currentWord.append(currentChar);
            } else {
                // Store the completed word and reset for the next word
                words[wordIndex++] = currentWord.toString();
                currentWord.setLength(0); // Clear the StringBuilder
            }
        }
        // Add the last word to the array
        words[wordIndex] = currentWord.toString();

        return words;
    }

    // Method to create a 2D array where each word is paired with its length
    public static String[][] pairWordsWithLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i]; // Store the word
            int length = calculateStringLength(words[i]); // Calculate word length
            wordLengths[i][1] = String.valueOf(length); // Convert length to String
        }

        return wordLengths;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        // Step 1: Split text into words
        String[] words = splitTextIntoWords(userInput);

        // Step 2: Pair each word with its length
        String[][] wordsWithLengths = pairWordsWithLengths(words);

        // Step 3: Display the words and their lengths in a formatted table
        System.out.printf("%-15s%-10s\n", "Word", "Length");
        System.out.println("----------------------------");
        for (String[] wordWithLength : wordsWithLengths) {
            int length = Integer.parseInt(wordWithLength[1]); // Convert length back to Integer
            System.out.printf("%-15s%-10d\n", wordWithLength[0], length);
        }
    }
}
