import java.util.*;

public class SimpleInterest{
           public static double simpleInterest(double principle, double rate,double time){

              return (principle*rate*time)/100;

            } 
 
          public static void main(String []args){
           Scanner input = new Scanner(System.in);
         
          System.out.println("Enter Principle, Rate and Time respectivally :");
           double principle = input.nextInt();
           double rate = input.nextInt();
           double time = input.nextInt();
       
           double ans = simpleInterest(principle,rate,time);

           System.out.println("The Simple Interest is "+ans+" for Principle"+principle+",Rate,"+rate+" and Time"+time);
         }
}