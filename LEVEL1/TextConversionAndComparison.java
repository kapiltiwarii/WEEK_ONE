import java.util.Scanner;

public class TextConversionAndComparison {

    public static String convertToLowerUsingCharAt(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32); // Convert uppercase to lowercase
            }
            result.append(c);
        }
        return result.toString();
    }

    public static boolean compareStrings(String text1, String text2) {
        return text1.equals(text2);
    }

    public static String[][] splitTextIntoWords(String text) {
        String[] words = text.split("\\s+");
        String[][] wordWithLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordWithLengths[i][0] = words[i];
            wordWithLengths[i][1] = String.valueOf(words[i].length());
        }

        return wordWithLengths;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a complete text: ");
        String userInput = scanner.nextLine();

        String lowerCaseTextUsingCharAt = convertToLowerUsingCharAt(userInput);
        String lowerCaseTextUsingBuiltInMethod = userInput.toLowerCase();

        boolean areEqual = compareStrings(lowerCaseTextUsingCharAt, lowerCaseTextUsingBuiltInMethod);

        System.out.println("\nLowercase text using charAt(): " + lowerCaseTextUsingCharAt);
        System.out.println("Lowercase text using toLowerCase(): " + lowerCaseTextUsingBuiltInMethod);
        System.out.println("\nAre the two results the same? " + areEqual);

        String[][] wordLengths = splitTextIntoWords(userInput);
        System.out.println("\nWords and their lengths:");
        for (String[] wordWithLength : wordLengths) {
            System.out.println("Word: " + wordWithLength[0] + ", Length: " + wordWithLength[1]);
        }
    }
}
