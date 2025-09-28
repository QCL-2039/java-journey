import java.util.Scanner;

public class Print_Table_Upto_Num {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = cin.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();

        }
        cin.close();
    }
}
