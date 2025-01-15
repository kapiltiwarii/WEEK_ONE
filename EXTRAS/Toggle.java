import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input= scanner();

        String toggledString = toggleCase(input);
        System.out.println("Original String: " + input);
        System.out.println("Toggled String: " + toggledString);
    }

    public static String toggleCase(String str) {
        StringBuilder toggled = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggled.append(Character.toUpperCase(c));
            } else {
                toggled.append(c); // Non-alphabetical characters remain unchanged
            }
        }
        
        return toggled.toString();
    }
}
