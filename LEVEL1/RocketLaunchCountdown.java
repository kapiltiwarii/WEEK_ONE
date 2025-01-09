import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the countdown starting value ");
        int counter = scanner.nextInt();

        while (counter >= 1) {

            System.out.println(counter);
            counter--;
        }

        System.out.println("Rocket has launched");

    }
}
