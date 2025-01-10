import java.util.Scanner;

public class MultiplicationTableSixtoNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int integerArray[] = new int[4];
        int count =6;
        for (int i =0; i <4; i++) {
            integerArray[i] = number * count;
            count++;
        }
        int count1 = 6;

        for (int i = 0; i <4; i++) {
            System.out.println(number + "*" + count1 + " =" + integerArray[i]);
            count1++;
        }
    }
}