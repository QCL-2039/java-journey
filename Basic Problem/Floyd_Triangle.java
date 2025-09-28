import java.util.Scanner;

public class Floyd_Triangle {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the size of triangle:");
        int size = cin.nextInt();
        int sum = 1;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(sum + " ");
                sum++;
            }
            System.out.println();
        }
        cin.close();
    }

}