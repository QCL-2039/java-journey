import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your decimal number:");
        int num = cin.nextInt();
        cin.close();
        int temp = num;
        String hex = "";
        int extra;

        while (temp > 0) {
            extra = temp % 16;
            if (extra == 10) {
                hex = "A" + hex;
            } else if (extra == 11) {
                hex = "B" + hex;
            } else if (extra == 12) {
                hex = "C" + hex;
            } else if (extra == 13) {
                hex = "D" + hex;
            } else if (extra == 14) {
                hex = "E" + hex;
            } else if (extra == 15) {
                hex = "F" + hex;
            } else {
                hex = extra + hex;
            }

            temp /= 16;

        }
        System.out.println("Hexadecimal of " + num + " is " + hex);
    }
}
