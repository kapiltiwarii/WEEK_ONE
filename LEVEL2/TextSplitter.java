import java.util.Scanner;

public class TextSplitter {

    // Method to find the length of a string without using the length() method
    public static int findLengthWithoutLengthMethod(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string reached
        }
        return length;
    }

    // Method to split text into words without using split() method
    public static String[] splitTextIntoWords(String text) {
        int length = findLengthWithoutLengthMethod(text);
        int wordCount = 1; // At least one word is present

        // Count the number of spaces to determine the number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Array to store the words
        String[] words = new String[wordCount];
        int wordIndex = 0;
        StringBuilder currentWord = new StringBuilder();

        // Split the text into words
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            if (currentChar != ' ') {
                currentWord.append(currentChar);
            } else {
                words[wordIndex++] = currentWord.toString();
                currentWord.setLength(0); // Reset the StringBuilder for the next word
            }
        }
        words[wordIndex] = currentWord.toString(); // Add the last word

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String userInput = scanner.nextLine();

        // Split text using the custom method
        String[] customSplitWords = splitTextIntoWords(userInput);

        // Split text using the built-in split() method
        String[] builtInSplitWords = userInput.split(" ");

        // Compare the two string arrays
        boolean areArraysEqual = compareStringArrays(customSplitWords, builtInSplitWords);

        // Display the results
        System.out.println("Words using custom method: ");
        for (String word : customSplitWords) {
            System.out.println(word + " ");
        }
        System.out.println();

        System.out.println("Words using built-in split() method: ");
        for (String word : builtInSplitWords) {
            System.out.println(word + " ");
        }
        System.out.println();

        // Display comparison result
        System.out.println("Are the two methods' results equal? " + areArraysEqual);
    }
}
