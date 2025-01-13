import java.util.Scanner;

public class SubstringComparison {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        System.out.print("Enter start index: ");
        int startIndex = scanner.nextInt();
        
        System.out.print("Enter end index: ");
        int endIndex = scanner.nextInt();
     
        String customSubstring = createSubstringUsingCharAt(inputString, startIndex, endIndex);
        

        String builtInSubstring = inputString.substring(startIndex, endIndex);
        
  
        boolean areEqual = compareStrings(customSubstring, builtInSubstring);
        
      
        System.out.println("Substring using charAt(): " + customSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Are both substrings equal? " + areEqual);
        
        scanner.close();
    }
    
    // Method to create a substring using the charAt() method
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        String substring="";
        for (int i = start; i < end; i++) {
            substring += str.charAt(i);
        }
        return substring.toString();
    }
    
    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
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
}
