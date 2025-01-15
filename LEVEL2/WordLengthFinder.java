import java.util.Scanner;

public class WordLengthFinder {

    // Method to find the length of a string without using the built-in length() method
    public static int calculateStringLength(String str) {
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

    // Method to split text into words using charAt() without using the split() method
    public static String[] splitTextIntoWords(String text) {
        int length = calculateStringLength(text);
        int wordCount = 1; // Start with one word

        // Count spaces to determine the number of words
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

    // Method to create a 2D array with words and their lengths
    public static String[][] pairWordsWithLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i]; // Store the word
            int length = calculateStringLength(words[i]); // Calculate word length
            wordLengths[i][1] = String.valueOf(length); // Convert length to String
        }

        return wordLengths;
    }

    // Method to find the shortest and longest words
    public static String[] findShortestAndLongestWords(String[][] wordLengths) {
        String shortestWord = wordLengths[0][0];
        String longestWord = wordLengths[0][0];
        int shortestLength = Integer.parseInt(wordLengths[0][1]);
        int longestLength = Integer.parseInt(wordLengths[0][1]);

        // Traverse the 2D array to find the shortest and longest words
        for (String[] wordLength : wordLengths) {
            int length = Integer.parseInt(wordLength[1]);
            if (length < shortestLength) {
                shortestWord = wordLength[0];
                shortestLength = length;
            }
            if (length > longestLength) {
                longestWord = wordLength[0];
                longestLength = length;
            }
        }

        return new String[]{shortestWord, String.valueOf(shortestLength), longestWord, String.valueOf(longestLength)};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String userInput = scanner.nextLine();

        // Step 1: Split text into words
        String[] words = splitTextIntoWords(userInput);

        // Step 2: Pair each word with its length
        String[][] wordsWithLengths = pairWordsWithLengths(words);

        // Step 3: Find the shortest and longest words
        String[] result = findShortestAndLongestWords(wordsWithLengths);

        // Step 4: Display the results
        System.out.println("Shortest word: " + result[0] + " (Length: " + result[1] + ")");
        System.out.println("Longest word: " + result[2] + " (Length: " + result[3] + ")");
    }
}
