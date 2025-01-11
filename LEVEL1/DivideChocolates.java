import java.util.Scanner;

public class DivideChocolates {

    public static int[] findRemainderAndQuotient(int chocolates, int children) {
       
        int chocPerChild = chocolates / children;
        int remaining= chocolates % children;
        return new int[] {chocPerChild,remaining} ;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking user input chocolates and children
        System.out.print("Enter the number of chocolates ");
        int chocolates = scanner.nextInt();

        System.out.print("Enter the number of children ");
        int children = scanner.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);

        // Display the quotient and remainder
        System.out.println("Each children get chocolates " + result[0]);
        System.out.println("Remaining chocolates " + result[1]);

    }
}