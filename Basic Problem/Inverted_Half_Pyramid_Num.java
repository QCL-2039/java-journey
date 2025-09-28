import java.util.Scanner;

public class Inverted_Half_Pyramid_Num {
    public static void main(String[] arsgs) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the size of your number pyramid:");
        int size = cin.nextInt();
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        cin.close();
    }
}
