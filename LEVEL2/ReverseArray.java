import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count = 0;
        int num = number;
       
        while (number != 0) {
            number = number / 10;
            count++;
        }

        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = num % 10;
            num = num / 10;
        }
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);

        }

    }
}