import java.util.*;
public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the weight in pounds:");
        double weightInPounds = scanner.nextDouble();

        double weightInKilograms = weightInPounds / 2.2;

        System.out.println("The weight of the person in pounds is " + weightInPounds);

        System.out.println("The weight of the person in kilograms is " + weightInKilograms);
    }
}