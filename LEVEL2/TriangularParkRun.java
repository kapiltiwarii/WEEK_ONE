import java.util.Scanner;

public class TriangularParkRun {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the sides of the triangle
        System.out.print("Enter the length of side1 in meter: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side2 in meter: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side3 in meter: ");
        double side3 = scanner.nextDouble();


        double perimeter = side1 + side2 + side3;

        
        double totalDistance = 5000;  

        // Calculate the number of rounds the athlete must complete
        double rounds = totalDistance / perimeter;

     
        System.out.println("The total number of rounds the athlete will run is " + rounds);
      
    }
}
