import java.util.Scanner;

public class FactorialRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to calculate its factorial:");
        int number = scanner.nextInt();

        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
        scanner.close();
    }

    public static long calculateFactorial(int n) {
        if (n == 0) return 1;
        return n * calculateFactorial(n - 1);
    }
}
