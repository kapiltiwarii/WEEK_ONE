import java.util.Scanner;

public class SumOfnNaturalNumbers {

   
    public static int sumOfnNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Taking the user input
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
       
       
            // Call the method and display the result
            int result = sumOfNaturalNumbers(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + result);
       
       
    }
}