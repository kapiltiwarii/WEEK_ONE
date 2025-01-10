import java.util.Scanner;

public class Fizzbuzz {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    String array[] = new String[number + 1];
    for (int i = 0; i <= number; i++) {
        array[i] = "i";

    }

    for (int i = 0; i <= number; i++) {
        if (i == 0) {
            System.out.println("position " + i + "=" + " 0");
        } else if (i % 3 == 0) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("position " + i + "=" + " FizzBuzz");
            } else {
                System.out.println("position " + i + "=" + " Fizz");
            }
        } else if (i % 5 == 0) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("position " + i + "=" + " FizzBuzz");
            } else {
                System.out.println("position " + i + "=" + " Buzz");
            }
        }

        else {
            System.out.println("position " + i + "=" + i);
        }
    }
}
}
