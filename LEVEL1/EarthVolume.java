import java.util.*;

public class EarthVolume {
    public static void main(String[] args) {

        double radiusKm = 6378;
        double PI = Math.PI;

        double volumeKm = (4.0 / 3.0) * PI * Math.pow(radiusKm, 3);

        double conversionFactor = 0.621371;
        double volumeMiles = volumeKm * Math.pow(conversionFactor, 3);

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm);
        System.out.println("The volume of Earth in cubic miles is " + volumeMiles);
    }
}
