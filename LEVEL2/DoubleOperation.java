import java.util.*;

public class DoubleOperation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter three integer number");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();

    double ans1 = a + b * c;
    double ans2 = a * b + c;
    double ans3 = c + a / b;
    double ans4 = a % b + c;

    System.out.println("The results of Int Operations are " + ans1 + "," + ans2 + "," + ans3 + " and " + ans4);
  }
}