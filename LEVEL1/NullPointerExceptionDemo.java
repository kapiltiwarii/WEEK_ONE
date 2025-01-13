public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        // Attempting to call a method on a null object will generate NullPointerException
        int length = text.length();  // This line will throw NullPointerException
        System.out.println("Length of text: " + length);
    }

    // Method to demonstrate NullPointerException handling
    public static void handleException() {
        String text = null;
        try {
            // Attempting to call a method on a null object
            int length = text.length();
            System.out.println("Length of text: " + length);
        } catch (NullPointerException e) {
            // Catch the NullPointerException and handle it
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Calling the method that generates the exception
        System.out.println("Demonstrating exception generation:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException in main: " + e.getMessage());
        }

        // Calling the method that handles the exception
        System.out.println("\nDemonstrating exception handling:");
        handleException();
    }
}
