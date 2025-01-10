import java.util.Scanner;

public class StudentGradeCalculator2D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create a 2D array to store marks: rows for students, columns for subjects
        int[][] marks = new int[numStudents][3]; // 3 columns for Physics, Chemistry, and Maths
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            // Input marks for Physics, Chemistry, and Maths
            marks[i][0] = getPositiveMarks(scanner, "Physics", i);
            marks[i][1] = getPositiveMarks(scanner, "Chemistry", i);
            marks[i][2] = getPositiveMarks(scanner, "Maths", i);

            // Calculate percentage
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Calculate grade
            grades[i] = calculateGrade(percentages[i]);
        }

        // Display results
        System.out.println("\nStudent Results:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10c\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }

    // Method to get positive marks input and validate them
    private static int getPositiveMarks(Scanner scanner, String subject, int studentIndex) {
        int marks;
        while (true) {
            System.out.print("Enter " + subject + " marks for Student " + (studentIndex + 1) + " (0-100): ");
            marks = scanner.nextInt();
            if (marks >= 0 && marks <= 100) {
                break; // Valid input, exit loop
            } else {
                System.out.println("Invalid marks! Please enter a value between 0 and 100.");
            }
        }
        return marks;
    }

    // Method to calculate grade based on percentage
    private static char calculateGrade(double percentage) {
        if (percentage >= 80) {
            return 'A';
        } else if (percentage >= 70) {
            return 'B';
        } else if (percentage >= 60) {
            return 'C';
        } else if (percentage >= 50) {
            return 'D';
        } else if (percentage >= 40) {
            return 'E';
        } else {
            return 'R';
        }
    }
}