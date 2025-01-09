import java.util.*;

public class HeightConerter {
       public static void main(String[] args) {
              Scanner input = new Scanner(System.in);

              System.out.println("Enter your height in cm");
              double heightCM = input.nextDouble();

              double inches = heightCM / 2.54;

              int heightInches = (int) inches;

              int feet = heightInches / 12;

              System.out.println("Your Height in cm is " + heightCM + " while in feet is " + feet + " and inches is "
                            + heightInches);

       }
}