import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();

        boolean isPalindrome = checkPalindrome(input);
        System.out.println(input + " is " + (isPalindrome ? "a palindrome." : "not a palindrome."));
        scanner.close();
    }

    public static boolean checkPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}
