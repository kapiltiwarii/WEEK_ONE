import java.util.Scanner;

public class LexicographicalComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        int comparisonResult = compareStringsLexicographically(string1, string2);

        if (comparisonResult < 0) {
            System.out.println("\"" + string1 + "\" comes before \"" + string2 + "\" in lexicographical order.");
        } else if (comparisonResult > 0) {
            System.out.println("\"" + string1 + "\" comes after \"" + string2 + "\" in lexicographical order.");
        } else {
            System.out.println("\"" + string1 + "\" is equal to \"" + string2 + "\" in lexicographical order.");
        }

    }

    public static int compareStringsLexicographically(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (char1 != char2) {
                return char1 - char2; // Return difference if characters are not the same
            }
        }

        // If all characters up to the length of the shorter string are the same
        // Compare the lengths of the strings
        return str1.length() - str2.length();
    }
}
