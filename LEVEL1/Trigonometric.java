
import java.util.*;
public class Trigonometric{
     
     public double[] calculateTrigonometricFunctions(double radians){
           double sine = Math.sin(radians);
           double cosine = Math.cos(radians);
           double tangent = Math.tan(radians);
           return new double[]{sine, cosine, tangent};
           }
      public static void main (String args[]){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the angle in degree");
           double angle=sc.nextDouble();
           double radians= Math.toRadians(angle);

           Trigonometric obj=new Trigonometric();
           double result[]=obj.calculateTrigonometricFunctions(radians);

           System.out.println("Sine: "+result[0]);
           System.out.println("Sine: "+result[1]);
           System.out.println("Sine: "+result[2]);
      }
}