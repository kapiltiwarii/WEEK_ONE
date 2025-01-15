import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char mostFrequentChar = findMostFrequentCharacter(input);
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }

    public static char findMostFrequentCharacter(String str) {
        int[] charCounts = new int[256]; // ASCII character count array

        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            charCounts[str.charAt(i)]++;
        }

        char mostFrequentChar = '\0';
        int maxCount = 0;

        // Find the character with the maximum frequency
        for (int i = 0; i < charCounts.length; i++) {
            if (charCounts[i] > maxCount) {
                maxCount = charCounts[i];
                mostFrequentChar = (char) i;
            }
        }

        return mostFrequentChar;
    }
}
