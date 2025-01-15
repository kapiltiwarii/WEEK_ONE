import java.util.Scanner;

public class GCDAndLCMCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers to calculate GCD and LCM:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int gcd = calculateGCD(a, b);
        int lcm = calculateLCM(a, b, gcd);

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
        scanner.close();
    }

    public static int calculateGCD(int a, int b) {
        if (b == 0) return a;
        return calculateGCD(b, a % b);
    }

    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
