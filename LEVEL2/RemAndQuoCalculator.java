import java.util.*;

public class RemAndQuoCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number1 = input.nextInt();
        double number2 = input.nextInt();

        double quotient = number1 / number2;

        double reminder = number1 % number2;

        System.out.println("The Quotient is " + quotient + " and Reminder is " + reminder + " of two numbers " + number1
                + " and " + number2);

    }
}