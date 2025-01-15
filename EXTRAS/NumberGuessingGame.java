import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100.");

        do {
            guess = lowerBound + random.nextInt(upperBound - lowerBound + 1);
            System.out.println("Is your number " + guess + "? (Enter: 'high', 'low', 'correct')");
            feedback = scanner.nextLine();

            if ("high".equalsIgnoreCase(feedback)) {
                upperBound = guess - 1;
            } else if ("low".equalsIgnoreCase(feedback)) {
                lowerBound = guess + 1;
            }

        } while (!"correct".equalsIgnoreCase(feedback));

        System.out.println("The computer guessed your number!");
        scanner.close();
    }
}
