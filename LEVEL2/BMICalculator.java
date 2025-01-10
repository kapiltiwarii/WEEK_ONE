import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        double[] heights = new double[numPersons];
        double[] weights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] statuses = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter height (in meters) and weight (in kg) for person " + (i + 1) + ":");
            heights[i] = scanner.nextDouble();
            weights[i] = scanner.nextDouble();

            bmis[i] = calculateBMI(weights[i], heights[i]);
            statuses[i] = getWeightStatus(bmis[i]);
        }

        System.out.println("Height (m)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s%n", heights[i], weights[i], bmis[i], statuses[i]);
        }
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

