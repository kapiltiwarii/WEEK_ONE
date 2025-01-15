import java.util.Scanner;

public class CountSubString {
    
    // Method to find occurance of the substring
    public static int subStringCount(String str,String subString){
          int count =0;
          int length=str.length();
          int index =0;
         for(int i = 0; i<str.length();i++){
             if(str.indexOf(subString,index)==-1){
               break;
             }
             else{
                     count++;
                     index=str.indexOf(subString,index)+subString.length();
                     
               }
         }
       
       return count;
    }
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.print("Enter a string: ");
        String str = scanner.next();
         
        String subString = scanner.next();
        int subStringCount = subStringCount(str,subString);
        
        System.out.print("Substring occurs "+subStringCount+" times");
         
         
}
}