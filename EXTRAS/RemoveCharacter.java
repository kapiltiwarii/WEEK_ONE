import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        String modifiedString = removeCharacter(inputString, charToRemove);
        System.out.println("Modified String: " + modifiedString);

     
    }

    public static String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}
