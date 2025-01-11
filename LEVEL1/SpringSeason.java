import java.util.Scanner;

public class SpringSeason {
    public static String isSpring(int month,int day)
    {
      boolean isSpring = (month == 3 && day >= 20) || // March 20 to March 31
                (month == 4) || (month == 5) ||  (month == 6 && day <= 20);
               
               
         
        if (isSpring) {
            return "It's a Spring Season";
        } else {
            return "Not a Spring Season";
        }


    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();
    
      String ans = isSpring(month,day);
     
     System.out.println(ans);
}
}