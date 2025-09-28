import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter your number to see factorial:");
        int num = cin.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + num + " is: " + fact);
        }

        cin.close();
    }
}
