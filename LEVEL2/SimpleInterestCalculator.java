import java.util.*;
public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Principal amount:");
        double principal = scanner.nextDouble();

        System.out.println("Enter the Rate of Interest (in %):");
        double rate = scanner.nextDouble();

        System.out.println("Enter the Time (in years):");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;


        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal
                + ", Rate of Interest " + rate + "%, and Time " + time + " years.");
    }
}