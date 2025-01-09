import java.util.*;

public class IntOperation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter three integer number");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();

    int ans1 = a + b * c;
    int ans2 = a * b + c;
    int ans3 = c + a / b;
    int ans4 = a % b + c;

    System.out.println("The results of Int Operations are " + ans1 + "," + ans2 + "," + ans3 + " and " + ans4);
  }
}