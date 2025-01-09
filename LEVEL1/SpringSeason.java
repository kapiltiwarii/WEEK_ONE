import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        boolean isSpring = (month == 3 && day >= 20) || // March 20 to March 31
                (month == 4) || // April
                (month == 5) || // May
                (month == 6 && day <= 20); // June 1 to June 20

        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

    }
}
