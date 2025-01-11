import java.util.Scanner;

public class QuotientAndRemainder {

   
    public static int[] findRemainderAndQuotient(int number, int divisor) {
       int rem = number%divisor;
       int quo = number/divisor;
      return new int[] {quo,rem};
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter the dividend nunber :");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor ");
        int divisor = scanner.nextInt();

       
       
            // Call the method to find the quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);
           
            // Display the quotient and remainder
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
       
    }
}

       