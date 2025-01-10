import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();  
       
        // Find the count of digits and store the digits in an array
        int[] digits = new int[20];  
        int count = 0;
       
       
        while (number > 0) {
            digits[count] = (int) (number % 10);  // Store the last digit of number
            number /= 10;  // Remove the last digit of number
            count++;  
        }
       
       
        int[] frequency = new int[10];
       
       
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }
       
        // Display the frequency of each digit
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + "= " + frequency[i] + " times");
            }
        }
    }
}