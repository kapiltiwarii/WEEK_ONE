import java.util.Scanner;

public class YoungestAndTallestFriend {

    public static String findYoungest(int[] ages, String[] names) {
        int youngestAge = ages[0];
        String youngestFriend = names[0];

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = names[i];
            }
        }
        return youngestFriend;
    }

    public static String findTallest(int[] heights, String[] names) {
        int tallestHeight = heights[0];
        String tallestFriend = names[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = names[i];
            }
        }
        return tallestFriend;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Arrays to store names, ages, and heights of friends
        String[] names = { "Amar", "Akbar", "Anthony" };
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Take input for ages
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter the height of " + names[i] + " in cm: ");
            heights[i] = scanner.nextInt();
        }

     
        // Find and display the youngest friend
        String youngestFriend = findYoungest(ages, names);
        System.out.println("The youngest friend is: " + youngestFriend);

        // Find and display the tallest friend
        String tallestFriend = findTallest(heights, names);
        System.out.println("The tallest friend is: " + tallestFriend);

    }
}
