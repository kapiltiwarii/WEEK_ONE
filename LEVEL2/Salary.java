import java.util.*;

public class Salary {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      
    System.out.println("ENTER SALARY ");
    int salary = input.nextInt();

    \System.out.println("ENTER BONUS ");
    int bonus = input.nextInt();
    
    int totalSalary = salary+bonus;
    System.out.println("The salary is INR "+salary+" and bonus is INR. "+bonus+ " Hence Total Income is INR "+totalSalary);
  }
}
