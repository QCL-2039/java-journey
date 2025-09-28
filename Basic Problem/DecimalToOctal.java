import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your decimal number:");
        int num = cin.nextInt();
        cin.close();
        String oct = "";
        int temp = num;
        while (temp > 0) {
            oct = temp % 8 + oct;
            temp /= 8;
        }
        System.out.printf("Octal of %d is: %s", num, oct);
    }
}
