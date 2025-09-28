import java.util.Scanner;

public class Solid_Rectangle_Pattern {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the outer loop:");
        int outer = cin.nextInt();
        System.out.println("Enter the the inner:");
        int inner = cin.nextInt();
        for (int i = 0; i < outer; i++) {
            for (int j = 0; j < inner; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        cin.close();
    }
}
