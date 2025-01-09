import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double weight = scanner.nextDouble();
        double heightCm = scanner.nextDouble();
        
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        
        System.out.println("BMI: " + bmi);
        
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
        

    }
}
