import java.util.*;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double baseInches = sc.nextDouble();
        double heightInches = sc.nextDouble();
        double areaInches = 0.5 * baseInches * heightInches;
        System.out.println("Area of the triangle is " + areaInches);
        double heightCm = heightInches * 2.54;
        int feet = (int) (heightInches / 12);
        double inches = heightInches % 12;
        System.out.println("Your height in cm is " + heightCm + " cm, while in feet is " + feet + " feet and " + inches
                + " inches.");
    }
}
