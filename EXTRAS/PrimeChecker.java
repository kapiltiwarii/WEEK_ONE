import java.util.Scanner;

public class PrimeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it's prime:");
        int number = scanner.nextInt();

        boolean isPrime = checkPrime(number);
        System.out.println(number + " is " + (isPrime ? "a prime number." : "not a prime number."));
        scanner.close();
    }

    public static boolean checkPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
