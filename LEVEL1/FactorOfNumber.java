import java.util.*;

public class FactorOfNumber {
public static void main(String []args){
     Scanner input = new Scanner(System.in);
    System.out.println("Enter the number to find factors: ");
     int number = input.nextInt();
     int maxFactor=10;
     int Array[]=new int[maxFactor];
     int s=1;
  
 for(int i =1;i<maxFactor;i++){
    if(number%i==0){
    Array[s]=i;
s++;}
    

}
for(int i=1;i<s;i++){

System.out.println(Array[i]);
}

}}