import java.util.Scanner;

public class SmallestNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        if (number1 < number2 && number1 < number3) {
            System.out.println("Yes");
        } else {
            System.out.println("NO ");
        }
    }
}