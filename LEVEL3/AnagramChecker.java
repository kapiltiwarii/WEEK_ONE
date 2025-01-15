import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if lengths of both texts are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create frequency arrays to store the character counts of both texts
        int[] frequency1 = new int[256]; // ASCII size of 256
        int[] frequency2 = new int[256];

        // Loop through both texts and calculate frequency of each character
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // Compare the frequency arrays of both texts
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false; // If frequencies don't match, not an anagram
            }
        }

        return true; // If all frequencies match, the texts are anagrams
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for two texts
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Call the method to check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }
    }
}
