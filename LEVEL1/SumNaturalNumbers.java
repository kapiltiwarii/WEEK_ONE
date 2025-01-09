import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n > 0) {
            // Computing sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Computing sum using a while loop
            int sumWhileLoop = 0;
            int counter = 1;
            while (counter <= n) {
                sumWhileLoop += counter;
                counter++;
            }

            // Compare the results
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumWhileLoop);

            if (sumFormula == sumWhileLoop) {
                System.out.println("Both computations are same");
            } else {
                System.out.println("Both computations are different");
            }
        } else {
            System.out.println("Please enter a positive natural number.");
        }

    }
}
