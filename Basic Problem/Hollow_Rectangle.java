import java.util.Scanner;

public class Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the width:");// number of rows
        int width = cin.nextInt();
        System.out.println("Enter the length:");// number column
        int length = cin.nextInt();
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= length; j++) {
                if (i == 1 || i == width || j == 1 || j == length) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        cin.close();
    }
}
