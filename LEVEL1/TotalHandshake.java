import java.util.Scanner;

public class TotalHandshake {
  public int totalHandshake(int n) {
    int numberOfHandshake = (n * (n - 1)) / 2;
    return numberOfHandshake;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    TotalHandshake obj = new TotalHandshake();

    System.out.println("The number of handshake of student " + number + " is " + obj.totalHandshake(number));
  }
}