import java.util.Random;

public class StudentScorecard {

    // Method to generate random scores for Physics, Chemistry, and Math
    public static int[][] generateRandomScores(int numberOfStudents) {
        Random rand = new Random();
        int[][] scores = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            // Generate random 2-digit scores for Physics, Chemistry, and Math
            scores[i][0] = rand.nextInt(41) + 60; // Random score between 60 and 100
            scores[i][1] = rand.nextInt(41) + 60; 
            scores[i][2] = rand.nextInt(41) + 60;
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round off to 2 decimal places
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to calculate the grade based on the percentage
    public static String[] calculateGrades(double[][] results) {
        int numberOfStudents = results.length;
        String[] grades = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percent", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d%-10d%-10d%-10d%-10.0f%-10.2f%-10.2f%-10s\n", 
                              (i + 1), 
                              scores[i][0], 
                              scores[i][1], 
                              scores[i][2], 
                              results[i][0], 
                              results[i][1], 
                              results[i][2], 
                              grades[i]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 5;

        // Step 1: Generate random scores
        int[][] scores = generateRandomScores(numberOfStudents);

        // Step 2: Calculate total, average, and percentage
        double[][] results = calculateResults(scores);

        // Step 3: Calculate grades
        String[] grades = calculateGrades(results);

        // Step 4: Display the scorecard
        displayScorecard(scores, results, grades);
    }
}
