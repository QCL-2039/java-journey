import java.util.Scanner;

//This code will print the sum of natural number upto given range
public class Find_Sum_N {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = cin.nextInt();
        int sum = 0;
        sum = (n * (n + 1)) / 2;
        System.out.println("Sum upto " + n + " is:" + sum);
        cin.close();
    }
}
