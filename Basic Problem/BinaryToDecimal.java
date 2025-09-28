import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your binary number:");
        int num = cin.nextInt();
        double decimal = 0;
        int i = 0;
        while (num > 0) {
            int temp = num % 10;
            decimal += temp * Math.pow(2, i);
            i++;
            num /= 10;
        }
        System.out.println(decimal);
        cin.close();
    }
}
