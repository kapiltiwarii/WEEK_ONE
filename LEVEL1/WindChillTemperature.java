import java.util.Scanner;

public class WindChillTemperature {


    public static double calculateWindChill(double temperature, double windSpeed){
         double windChill =35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);

         return windChill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the Temperature : ");
       double temperature = scanner.nextDouble();
        
       System.out.print("Enter the Wind Speed : ");
       double  windSpeed = scanner.nextDouble();
       
      double windChill = calculateWindChill(temperature,windSpeed);
      System.out.print("Wind Chill is :"+windChill);
      

}
}