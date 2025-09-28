import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter how many Fibonacci Numbers you want: ");
        int num = cin.nextInt();
        int a = 0, b = 1, next = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < num; i++) {
            next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        cin.close();
    }
}
