import java.util.*;

public class VotingEligibility{
public static void main(String []args){
     Scanner input = new Scanner(System.in);
     int n=10;
     int StudentAge[]=new int[n];
     
      
     for(int i=0; i<n; i++){
            StudentAge[i]=input.nextInt();
       }
     
      for(int i=0; i<n; i++){
           if(StudentAge[i]>=18){
            System.out.println("The student with the Age "+ StudentAge[i] + " can vote ");
         }
         else{
          System.out.println("The student with the Age "+ StudentAge[i] + " cannot vote ");
           }
       }  
    
}}