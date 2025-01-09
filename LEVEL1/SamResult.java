import java.util.*;

class SamResult {
    public static void main(String[] args) {
        double mathMarks = 94, physicsMarks = 95, chemistryMarks = 96;

        double totalObtainedMarks = mathMarks + physicsMarks + chemistryMarks;
        double totalMarks = 100 * 3;

        double averageMarks = (totalObtainedMarks / totalMarks) * 100;

        System.out.println("Sam's average mark in PCM is " + averageMarks + "%");
    }
}