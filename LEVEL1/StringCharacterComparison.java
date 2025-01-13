import java.util.Scanner;

public class StringCharacterComparison {


    public static char[] getCharactersWithoutToCharArray(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        // Get character array using user-defined method
        char[] userDefinedCharArray = getCharactersWithoutToCharArray(userInput);

        // Get character array using built-in toCharArray() method
        char[] builtInCharArray = userInput.toCharArray();

        // Compare the two character arrays
        boolean areArraysEqual = compareCharArrays(userDefinedCharArray, builtInCharArray);

        // Display the result
        System.out.println("Are both character arrays equal? " + areArraysEqual);
    }
}
