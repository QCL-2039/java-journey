import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your decimal number:");
        int num = cin.nextInt();
        cin.close();
        String binary = "";
        int temp = num;

        while (temp > 0) {
            binary = (temp % 2) + binary;
            temp /= 2;
        }

        System.out.printf("Binary of %d is: %s%n", num, binary);
    }
}
