import java.util.Scanner;

public class StringCompare {

 
    public static boolean compareUsingCharAt(String str1, String str2) {
        // If lengths are not equal, strings can't be the same
        if (str1.length() != str2.length()) {
            return false;
        }

     
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the first string: ");
        String string1 = scanner.next();

        System.out.print("Enter the second string: ");
        String string2 = scanner.next();


        boolean resultUsingCharAt = compareUsingCharAt(string1, string2);


        boolean resultUsingEquals = string1.equals(string2);

       
        System.out.println("Result using charAt(): " + resultUsingCharAt);
        System.out.println("Result using equals(): " + resultUsingEquals);

        // Check if both results are the same
        if (resultUsingCharAt == resultUsingEquals) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("The results from the two methods differ.");
        }

  
    }
}