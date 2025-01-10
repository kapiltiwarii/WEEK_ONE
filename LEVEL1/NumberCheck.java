import java.util.*;

public class NumberCheck {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = 5;
    System.out.println("Enter " + n + " Numbers :");
    int number[] = new int[n];

    for (int i = 0; i < n; i++) {
      number[i] = input.nextInt();

    }
//Checking number is positive or negative
    
    for (int i = 0; i < n; i++) {
      if (number[i] >= 0) {
        if (number[i] % 2 == 0) {
          System.out.println("The " + number[i] + " is Positive Even Number");
        } else {
          System.out.println("The " + number[i] + " is Positive Odd Number");
        }
      }

    }
// Comparing Last and First indexes 
    for (int i = 0; i < 1; i++) {
      if (number[i] == number[n - 1])
        System.out.println("First Index and Last Index are equal");

      else if (number[i] > number[n - 1])
        System.out.println("First Index is Larger");

      else
        System.out.println("Last Index is Larger");

    }
  }
}
