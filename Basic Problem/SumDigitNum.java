import java.util.Scanner;

public class SumDigitNum {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = cin.nextInt();
        int sum = 0;
        while (num > 0) {

            sum += (num % 10);
            num = num / 10;
        }
        System.out.println("Sum of digits of this number:" + sum);
        cin.close();
    }
}
