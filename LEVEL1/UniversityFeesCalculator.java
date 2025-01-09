import java.util.*;

public class UniversityFeesCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial Fees of Univercity");
        double initialFees = sc.nextDouble();

        System.out.print("Enter discount percentage");
        double discountPercent = sc.nextDouble();

        double discount = (discountPercent / 100) * initialFees;

        double FinalFees = initialFees - discount;

        System.out.println("Discounted amount INR " + discount + " and final discounted fee is INR " + FinalFees);

    }
}
