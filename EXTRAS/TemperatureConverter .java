import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature: ");
        double temp = scanner.nextDouble();

        System.out.println("Convert to (1) Celsius or (2) Fahrenheit?");
        int choice = scanner.nextInt();

        if (choice == 1) {
            double celsius = fahrenheitToCelsius(temp);
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            double fahrenheit = celsiusToFahrenheit(temp);
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        }
        scanner.close();
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
