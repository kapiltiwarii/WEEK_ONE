import java.util.Scanner;

public class CheckNumber {
  public int NumberCheck(int n) {
    if (n > 0) {
      return 1;
    }
    if (n < 0) {
      return -1;
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     //Taking number Input
    int number = sc.nextInt();
   //Creating object of the class
    CheckNumber obj = new CheckNumber();
    //Print the method
    System.out.println(obj.NumberCheck(number));
  }
}
