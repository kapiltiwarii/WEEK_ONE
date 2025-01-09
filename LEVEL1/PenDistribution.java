import java.util.*;

public class PenDistribution {
  public static void main(String[] args) {
    int totalPens = 14, students = 3;

    int penPerStudent = totalPens / students;

    int remainingPen = totalPens % students;

    System.out.println(
        "The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPen);
  }
}