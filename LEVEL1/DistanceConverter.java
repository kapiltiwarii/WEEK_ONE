import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double feetPerYard = 3.0;
        double yardsPerMile = 1760.0;

        double distanceInYards = distanceInFeet / feetPerYard;

        double distanceInMiles = distanceInYards / yardsPerMile;

        System.out.println("Distance in yards: " + distanceInYards);
        System.out.println("Distance in miles: " + distanceInMiles);

    }
}
