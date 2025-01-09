import java.util.*;

public class PerimeterOfSqare {
     public static void main(String[] args) {

          Scanner input = new Scanner(System.in);

          System.out.println("Enter Perimeter of Square");
          int perimeter = input.nextInt();

          int side = perimeter / 4;

          System.out.println("The side of square is " + side + " whose perimeter is " + perimeter);

     }
}