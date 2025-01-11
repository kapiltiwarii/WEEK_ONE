import java.util.*;

public class StudentGrades {

    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(101); // Inclusive of 0 to 100
            scores[i][1] = random.nextInt(101);
            scores[i][2] = random.nextInt(101);
        }
        return scores;
    }

    public static Object[][] calculateTotalAverageGrade(int[][] scores, int numStudents) {
        Object[][] result = new Object[numStudents][4]; // Total, Average, Percentage, Grade

        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            double percentage = Math.round(average * 100.0) / 100.0;

            result[i][0] = total;          // Total
            result[i][1] = average;        // Average
            result[i][2] = percentage;     // Percentage (rounded to 2 decimal places)
            result[i][3] = getGrade(percentage); // Grade as String
        }
        return result;
    }

    public static String getGrade(double percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R";
        }
    }

    public static void displayScorecard(int numStudents, int[][] scores, Object[][] result) {
        System.out.println("Scorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < numStudents; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t\t");
            }
            System.out.printf("%d\t%.2f\t%.2f%%\t\t%s\n",
                result[i][0], result[i][1], result[i][2], result[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = generateRandomScores(numStudents);
        Object[][] result = calculateTotalAverageGrade(scores, numStudents);

        displayScorecard(numStudents, scores, result);

        scanner.close();
    }
}
