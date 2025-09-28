import java.util.Scanner;

public class Right_Half_Pyramid {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the size of Pyramid:");
        int size = cin.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        cin.close();

    }
}
