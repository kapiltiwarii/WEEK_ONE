import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("Enter a string: ");
        String str = scanner.next();
         
        String newstr = "";
      for(int i = str.length()-1;i>=0;i--){
          newstr += str.charAt(i);
       }
        
      System.out.print("Reverse string :"+newstr);

       

    }
}
