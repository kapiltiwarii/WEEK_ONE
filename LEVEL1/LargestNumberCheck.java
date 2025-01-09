import java.util.Scanner;

public class LargestNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Check if each number is the largest
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);


       System.out.println("Is the first number the largest? " + isFirstLargest);
       System.out.println("Is the second number the largest? " + isSecondLargest);
       System.out.println("Is the third number the largest? " + isThirdLargest);
        
       
    }
}
