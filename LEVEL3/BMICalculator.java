import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status for a person
    public static String[] calculateBMI(double weight, double height) {
        // Convert height from cm to meters
        height = height / 100;
        
        // Calculate BMI
        double bmi = weight / (height * height);
        
        // Determine BMI status
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Return BMI and status along with weight and height
        return new String[] {String.format("%.2f", weight), String.format("%.2f", height * 100), String.format("%.2f", bmi), status};
    }

    // Method to calculate BMI for all members in the team
    public static String[][] calculateTeamBMI(double[][] teamData) {
        // Array to store height, weight, BMI, and status for each person
        String[][] result = new String[10][4];

        // Loop through each person and calculate BMI and status
        for (int i = 0; i < 10; i++) {
            double weight = teamData[i][0]; // Weight of the person in kg
            double height = teamData[i][1]; // Height of the person in cm
            
            // Call calculateBMI method to get BMI and status
            result[i] = calculateBMI(weight, height);
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayBMIResults(String[][] results) {
        System.out.println("-------------------------------------------------");
        System.out.printf("%-15s%-15s%-15s%-15s\n", "Weight (kg)", "Height (cm)", "BMI", "Status");
        System.out.println("-------------------------------------------------");
        
        // Loop through and display the results for each person
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-15s%-15s%-15s%-15s\n", results[i][0], results[i][1], results[i][2], results[i][3]);
        }
        
        System.out.println("-------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array to store weight (kg) and height (cm) for 10 people
        double[][] teamData = new double[10][2];

        // Take input for weight and height of each person
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter data for Person " + (i + 1) + ":");

            System.out.print("Enter weight (kg): ");
            teamData[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm): ");
            teamData[i][1] = scanner.nextDouble();

            System.out.println(); // Blank line for readability
        }

        // Call method to calculate BMI and status for each person
        String[][] bmiResults = calculateTeamBMI(teamData);

        // Display the results in tabular format
        displayBMIResults(bmiResults);

        scanner.close();
    }
}
