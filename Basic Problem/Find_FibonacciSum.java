import java.util.Scanner;

public class Find_FibonacciSum {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter how many Finbonacci Numbers Summation you want:");
        int num = cin.nextInt();
        int a = 0, b = 1, next = 0, sum = 0;
        if (num == 0) {
            sum = 0;
        } else {
            sum = 1;
        }
        System.out.println("Fibonacci numbers: ");
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < num; i++) {
            next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
            sum += next;
        }
        System.out.println("\nSum upto " + num + "th Fibonacci numbers: " + sum);

        cin.close();
    }

}
