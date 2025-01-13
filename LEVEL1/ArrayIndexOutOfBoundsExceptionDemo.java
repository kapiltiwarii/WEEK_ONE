import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    public static void generateException(String[] names) {
        // Accessing index beyond the array length will generate ArrayIndexOutOfBoundsException
        String name = names[10];  // Assuming the array length is less than 10
        System.out.println("Name at index 10: " + name);
    }

    public static void handleException(String[] names) {
        try {
            // Accessing index beyond the array length
            String name = names[10];  // This will cause ArrayIndexOutOfBoundsException
            System.out.println("Name at index 10: " + name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the array size and names
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        System.out.println("\nDemonstrating exception generation:");
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException in main: " + e.getMessage());
        }

        System.out.println("\nDemonstrating exception handling:");
        handleException(names);
    }
}
