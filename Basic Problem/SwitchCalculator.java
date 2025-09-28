import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your first number:");
        float a = cin.nextFloat();
        System.out.println("Enter your second number:");
        float b = cin.nextFloat();
        System.out.println("Enter a operator(+,-,*,/,%):");
        String op = cin.next();
        switch (op) {
            case "+":
                System.out.println("Addition of these numbers:" + (a + b));

                break;
            case "-":
                System.out.println("Subtraction of these numbers:" + (a - b));

                break;
            case "*":
                System.out.println("Multiplication of these numbers:" + (a * b));

                break;
            case "/":
                if (b == 0) {
                    System.out.println("Invalid Division.The number can't divid by zero.");
                } else
                    System.out.println("Division of these numbers:" + (a / b));

                break;
            case "%":
                if (b == 0) {
                    System.out.println("Invalid Division.The number can't divid by zero.");
                } else
                    System.out.println("Modulo of these numbers:" + (a % b));

                break;

            default:
                System.out.println("Invalid Operator.");
        }
        cin.close();
    }
}
