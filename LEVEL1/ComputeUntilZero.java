import java.util.*;

public class ComputeUntilZero {
public static void main(String []args){
     Scanner input = new Scanner(System.in);
      
     int Array[]=new int[10];
     double sum=0.0;
     int i = 0;
    while(true){
      Array[i]=input.nextInt();
    
       if(Array[i]<=0 )
       break;
      
      sum+=Array[i];
       
      i++;
       
     }
   System.out.println("Numbers are :");
   for (i =0;i<=10;i++){
     System.out.println(Array[i]);
 if(Array[i]<=0 )
       break;
    }
    System.out.println("Sum of Numbers are : "+sum);
     
}
}
