import java.util.*;

public class MeanHeight {
public static void main(String []args){
     Scanner input = new Scanner(System.in);
     double heights[]=new double[11];
     double mean =0.0;
     System.out.println("Enter heights (in cm) :");
     for(int i =0;i<11;i++){
      heights[i]=input.nextDouble();
      mean = mean+heights[i];
      }      
     double totalMean=mean/11; 
    System.out.println("Mean of heights "+totalMean);

}}
