import java.util.Scanner;

public class MaxOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = findMax(a, b, c);
        System.out.println("The maximum number is: " + max);
        scanner.close();
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
