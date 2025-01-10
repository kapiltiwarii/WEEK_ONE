import java.util.Scanner;

public class BMICalculatorMultiArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        double[][] personData = new double[numPersons][3]; // [][0] for height, [][1] for weight, [][2] for BMI
        String[] weightStatus = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter height (in meters) and weight (in kg) for person " + (i + 1) + ":");

            personData[i][0] = getValidInput(scanner, "Height");
            personData[i][1] = getValidInput(scanner, "Weight");

            personData[i][2] = calculateBMI(personData[i][1], personData[i][0]);
            weightStatus[i] = getWeightStatus(personData[i][2]);
        }

        System.out.println("Height (m)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s%n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }

    private static double getValidInput(Scanner scanner, String type) {
        double value;
        while (true) {
            System.out.print(type + ": ");
            value = scanner.nextDouble();
            if (value > 0) {
                break;
            }
            System.out.println("Invalid input. Please enter a positive value.");
        }
        return value;
    }

    private static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    private static String getWeightStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}
