import java.util.Scanner;

public class KMToMileConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in kilometers ");

        double distanceInKm = sc.nextDouble();

        double distanceInMiles = distanceInKm / 1.6;

        System.out.println("The total miles is " + distanceInMiles + " mile for the given " + distanceInKm + " km");
    }
}
