import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the first number ");
        int number1 = scanner.nextInt();

        // Taking user input for the second number
        System.out.print("Enter the second number  ");
        int number2 = scanner.nextInt();

        // Swap the numbers
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Print the swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        
    }
}
