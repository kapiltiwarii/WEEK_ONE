import java.util.Scanner;

public class TrimStringExample {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Find the starting index (ignoring leading spaces)
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Find the ending index (ignoring trailing spaces)
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt(), given start and end indexes
    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i)); // Append each character in the range
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // If lengths are different, return false
        }

        // Compare characters one by one
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Return false if any character doesn't match
            }
        }
        return true; // Return true if all characters match
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Trim using charAt()
        int[] trimIndexes = findTrimIndexes(inputString);
        String trimmedUsingCharAt = createSubstring(inputString, trimIndexes[0], trimIndexes[1]);

        // Trim using built-in trim() method
        String trimmedUsingBuiltIn = inputString.trim();

        // Compare both trimmed results
        boolean areStringsEqual = compareStrings(trimmedUsingCharAt, trimmedUsingBuiltIn);

        // Display results
        System.out.println("Trimmed using charAt(): " + "'" + trimmedUsingCharAt + "'");
        System.out.println("Trimmed using built-in trim(): " + "'" + trimmedUsingBuiltIn + "'");
        System.out.println("Are both trimmed strings equal? " + areStringsEqual);
    }
}
