public class UniversityFees {
    public static void main(String[] args) {

        double initialFees = 125000;
        double discountPercent = 10;

        double discount = (discountPercent / 100) * initialFees;

        double FinalFees = initialFees - discount;

        System.out.println("Discounted amount INR " + discount + " and final discounted fee is INR " + FinalFees);

    }
}
