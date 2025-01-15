import java.util.Scanner;

public class VowelConsonantCounter {

    // This method checks whether a character is a vowel, consonant, or not a letter.
    public static String checkCharacterType(char c) {
        // If the character is uppercase, convert it to lowercase for easier comparison
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + ('a' - 'A'));  // Convert to lowercase by adjusting ASCII value
        }

        // Check if the character is a vowel (a, e, i, o, u)
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";  // It's a vowel
        }

        // If the character is a letter but not a vowel, it's a consonant
        if (c >= 'a' && c <= 'z') {
            return "Consonant";  // It's a consonant
        }

        // If it's not a letter (like a symbol, number, etc.), return this
        return "Not a Letter";  // Not a letter (non-alphabetical characters)
    }

    // This method goes through the string, character by character, to count vowels and consonants.
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0;    // Variable to keep track of vowel count
        int consonants = 0; // Variable to keep track of consonant count

        // Loop through the string and check each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i); // Get the character at the current index
            String charType = checkCharacterType(currentChar);  // Determine if it's a vowel, consonant, or not a letter

            // If it's a vowel, increment the vowel count
            if (charType.equals("Vowel")) {
                vowels++;
            } 
            // If it's a consonant, increment the consonant count
            else if (charType.equals("Consonant")) {
                consonants++;
            }
            // If it's not a letter, we don't count it, just skip it
        }

        // Return both counts in an array: first element is vowels, second is consonants
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a scanner object to read user input

        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();  // Read the string entered by the user

        // Call the method to count vowels and consonants in the string
        int[] counts = countVowelsAndConsonants(userInput);

        // Display the results to the user in a friendly way
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);
    }
}
