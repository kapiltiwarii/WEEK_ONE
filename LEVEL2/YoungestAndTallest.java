import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter height of Amar (in cm): ");
        int amarHeight = scanner.nextInt();

        System.out.print("Enter age of Akbar: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        int akbarHeight = scanner.nextInt();

        System.out.print("Enter age of Anthony: ");
        int anthonyAge = scanner.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        int anthonyHeight = scanner.nextInt();


        int youngestAge = Math.min(Math.min(amarAge, akbarAge), anthonyAge);
        if (youngestAge == amarAge) {
            System.out.println("Amar is the youngest.");
        } else if (youngestAge == akbarAge) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }

       
        int tallestHeight = Math.max(Math.max(amarHeight, akbarHeight), anthonyHeight);
        if (tallestHeight == amarHeight) {
            System.out.println("Amar is the tallest.");
        } else if (tallestHeight == akbarHeight) {
            System.out.println("Akbar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }

      
    }
}
