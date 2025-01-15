import java.util.Scanner;

public class VowelConsonantCharacterType {

    // Check if the character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char c) {
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + ('a' - 'A'));  // Convert to lowercase if uppercase
        }

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";
        }

        if (c >= 'a' && c <= 'z') {
            return "Consonant";
        }

        return "Not a Letter";
    }

    // Find vowels and consonants in the string
    public static String[][] findVowelsAndConsonants(String text) {
        String[][] characterTypes = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            String charType = checkCharacterType(currentChar);

            characterTypes[i][0] = String.valueOf(currentChar);
            characterTypes[i][1] = charType;
        }

        return characterTypes;
    }

    // Display the characters and their types in a tabular format
    public static void displayCharacterTypes(String[][] characterTypes) {
        System.out.printf("%-15s%-15s\n", "Character", "Type");
        System.out.println("-----------------------------");

        for (int i = 0; i < characterTypes.length; i++) {
            System.out.printf("%-15s%-15s\n", characterTypes[i][0], characterTypes[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        String[][] characterTypes = findVowelsAndConsonants(userInput);

        displayCharacterTypes(characterTypes);
    }
}
