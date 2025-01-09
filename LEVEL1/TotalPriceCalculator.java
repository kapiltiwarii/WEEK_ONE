import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the unit price
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = scanner.nextDouble();

        // Prompt the user for the quantity
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        // Calculate the total purchase price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println("The total purchase price is INR "+totalPrice+"if the quantity "+quantity+ " and unit price is INR "+unitPrice)

       
    }
}
