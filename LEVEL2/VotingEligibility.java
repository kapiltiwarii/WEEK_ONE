import java.util.Scanner;

public class VotingEligibility {

    // Method to generate a random array of ages for students
    public static int[] generateRandomAges(int numberOfStudents) {
        int[] ages = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            // Generate a random age between 18 and 25 (2-digit numbers)
            ages[i] = 18 + (int) (Math.random() * (26 - 18)); // Random age between 18 and 25
        }
        return ages;
    }

    // Method to check whether a student can vote based on age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2]; // 2D array to store age and eligibility status

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            String eligibility = "Cannot Vote"; // Default eligibility

            if (age >= 18) {
                eligibility = "Can Vote"; // Student can vote if age is 18 or above
            }

            if (age < 0) {
                eligibility = "Invalid Age"; // If age is negative, it's invalid
            }

            result[i][0] = String.valueOf(age); // Store the age
            result[i][1] = eligibility; // Store the eligibility status
        }

        return result;
    }

    // Method to display the results in a tabular format
    public static void displayEligibility(String[][] result) {
        // Print the table header
        System.out.printf("%-10s%-20s\n", "Age", "Voting Eligibility");
        System.out.println("-------------------------------");

        // Iterate through the 2D array and display the age and eligibility status
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10s%-20s\n", result[i][0], result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the number of students (for this example, 10 students)
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt(); // Read the number of students

        // Generate random ages for the students
        int[] ages = generateRandomAges(numberOfStudents);

        // Check voting eligibility based on the ages
        String[][] eligibility = checkVotingEligibility(ages);

        // Display the results in tabular format
        displayEligibility(eligibility);
    }
}
