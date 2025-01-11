
import java.util.*;

public class NaturalNumberSum {

    // Method to calculate sum using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to calculate sum using the formula n*(n+1)/2
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take a number from the user
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("Input is not a natural number. Exiting.");
            return;
        }

        // Calculate the sum using recursion
        int recursiveSum = sumUsingRecursion(n);

        // Calculate the sum using the formula
        int formulaSum = sumUsingFormula(n);

        // Display the results
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        // Compare the results
        if (recursiveSum == formulaSum) {
            System.out.println("Both computations are correct");
        }
    }
}
