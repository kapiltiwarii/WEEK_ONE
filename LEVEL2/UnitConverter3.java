
import java.util.*;

public class UnitConverter3 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    // Main method for testing
    // Test cases
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input 
        System.out.print("Enter input in fahreinheit: ");
        double fahreinheit = sc.nextDouble();
        double celsiusres = UnitConverter3.convertFahrenheitToCelsius(fahreinheit);
        System.out.println("In celsius: " + celsiusres);//result in Celsius

        System.out.print("Enter the input in celsius: ");
        double celsius = sc.nextDouble();
        double fahreinheitres = UnitConverter3.convertCelsiusToFahrenheit(celsius);
        System.out.println("In fahreinheit: " + fahreinheitres);//result in fahreinheit

        System.out.print("Enter the input in pounds: ");
        double pounds = sc.nextDouble();
        double kilogramsres = UnitConverter3.convertPoundsToKilograms(pounds);
        System.out.println("In kilograms: " + kilogramsres);//result in kilograms

        System.out.print("Enter the input in kilograms: ");
        double kilograms = sc.nextDouble();
        // Call the method to convert kilogram to pounds
        double poundres = UnitConverter3.convertKilogramsToPounds(kilograms);
        // Display value in pounds
        System.out.println("In pound: " + poundres);

        System.out.print("Enter the input in gallons: ");
        double gallons = sc.nextDouble();
        // Call the method to convert gallon to liters
        double litersres = UnitConverter3.convertGallonsToLiters(gallons);
        // Display value in liters
        System.out.println("In liters " + litersres);

        System.out.print("Enter the input in liters: ");
        double liters = sc.nextDouble();
        // Call the method to convert liters to gallons
        double gallonsres = UnitConverter3.convertLitersToGallons(liters);
        // Display value in gallons
        System.out.println("In gallons " + gallonsres);

        // Close the Scanner object
        sc.close();

    }
}
