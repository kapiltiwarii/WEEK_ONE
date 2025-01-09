import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double first = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double second = scanner.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        String op = scanner.next();

        double result = 0;

        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;  // Exit the program if division by zero occurs
                }
                break;
            default:
                System.out.println("Invalid Operator");
                return;  // Exit the program if the operator is invalid
        }

        System.out.println("Result: " + result);
     
    }
}
