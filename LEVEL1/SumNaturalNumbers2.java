import java.util.Scanner;

public class SumNaturalNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n > 0) {
            // Compute sum using the formula
            int sumFormula = n * (n + 1) / 2;

            // Compute sum using a for loop
            int sumForLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumForLoop += i;
            }

            // Compare the results
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using for loop: " + sumForLoop);

            if (sumFormula == sumForLoop) {
                System.out.println("Both computations match!");
            } else {
                System.out.println("Both computations are different");
            }
        } else {
            System.out.println("Please enter a positive natural number.");
        }

    }
}
