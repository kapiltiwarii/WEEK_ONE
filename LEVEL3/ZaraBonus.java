import java.util.Random;

public class ZaraBonus {

    public static int[][] determineSalaryAndService(int numEmployees) {
        Random random = new Random();
        int[][] salaryAndService = new int[numEmployees][2];
        for (int i = 0; i < numEmployees; i++) {
            salaryAndService[i][0] = random.nextInt(90000) + 10000;
            salaryAndService[i][1] = random.nextInt(21);
        }
        return salaryAndService;
    }

    public static double[][] calculateNewSalaryAndBonus(int[][] salaryAndService, int numEmployees) {
        double[][] newSalaryAndBonus = new double[numEmployees][3];
        for (int i = 0; i < numEmployees; i++) {
            double bonusPercentage = salaryAndService[i][1] > 5 ? 0.05 : 0.02;
            double bonus = salaryAndService[i][0] * bonusPercentage;
            double newSalary = salaryAndService[i][0] + bonus;
            newSalaryAndBonus[i][0] = salaryAndService[i][0];
            newSalaryAndBonus[i][1] = newSalary;
            newSalaryAndBonus[i][2] = bonus;
        }
        return newSalaryAndBonus;
    }

    public static void displayResults(int[][] salaryAndService, double[][] newSalaryAndBonus, int numEmployees) {
        double oldSalarySum = 0;
        double newSalarySum = 0;
        double totalBonus = 0;

        System.out.println("Employee\tOld Salary\tNew Salary\tBonus");
        for (int i = 0; i < numEmployees; i++) {
            System.out.print((i + 1) + "\t\t");
            System.out.print(salaryAndService[i][0] + "\t\t");
            System.out.print(Math.round(newSalaryAndBonus[i][1]) + "\t\t");
            System.out.println(Math.round(newSalaryAndBonus[i][2]));
            
            oldSalarySum += salaryAndService[i][0];
            newSalarySum += newSalaryAndBonus[i][1];
            totalBonus += newSalaryAndBonus[i][2];
        }

        System.out.println("\nTotal Old Salary: " + oldSalarySum);
        System.out.println("Total New Salary: " + newSalarySum);
        System.out.println("Total Bonus: " + totalBonus);
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        
        int[][] salaryAndService = determineSalaryAndService(numEmployees);
        double[][] newSalaryAndBonus = calculateNewSalaryAndBonus(salaryAndService, numEmployees);
        
        displayResults(salaryAndService, newSalaryAndBonus, numEmployees);
    }
}
