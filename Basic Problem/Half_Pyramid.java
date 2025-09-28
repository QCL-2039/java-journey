import java.util.Scanner;

public class Half_Pyramid {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the size of Pyramid:");
        int size = cin.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        cin.close();

    }
}
