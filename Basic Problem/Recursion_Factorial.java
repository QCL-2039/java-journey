import java.util.Scanner;

public class Recursion_Factorial {
    public static int R_Factorial(int x) {
        {
            if (x == 0 || x == 1) {
                return 1;
            } else {
                return x * R_Factorial(x - 1);
            }
        }

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter your number:");
        int num = cin.nextInt();
        if (num < 0) {
            System.out.println("Factorial is defined only for positive number.");
        } else {
            int result = R_Factorial(num);
            System.out.println("Factorial of " + num + " is:" + result);
        }

        cin.close();
    }
}
