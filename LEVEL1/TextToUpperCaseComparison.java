import java.util.Scanner;

public class TextToUpperCaseComparison {

    public static String convertToUpperUsingCharAt(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32); // Convert lowercase to uppercase
            }
            result.append(c);
        }
        return result.toString();
    }

    public static boolean compareStrings(String text1, String text2) {
        return text1.equals(text2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a complete text: ");
        String userInput = scanner.nextLine();

        String upperCaseTextUsingCharAt = convertToUpperUsingCharAt(userInput);
        String upperCaseTextUsingBuiltInMethod = userInput.toUpperCase();

        boolean areEqual = compareStrings(upperCaseTextUsingCharAt, upperCaseTextUsingBuiltInMethod);

        System.out.println("\nUppercase text using charAt(): " + upperCaseTextUsingCharAt);
        System.out.println("Uppercase text using toUpperCase(): " + upperCaseTextUsingBuiltInMethod);
        System.out.println("\nAre the two results the same? " + areEqual);
    }
}
