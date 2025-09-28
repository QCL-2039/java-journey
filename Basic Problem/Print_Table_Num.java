import java.util.Scanner;

public class Print_Table_Num {
    public static void main(
            String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = cin.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        cin.close();
    }
}
