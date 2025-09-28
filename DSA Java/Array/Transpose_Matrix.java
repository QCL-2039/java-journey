import java.util.Scanner;

public class Transpose_Matrix {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the size of your array:(Rows x Columns):");
        int Rows = cin.nextInt();
        int Columns = cin.nextInt();
        int[][] arr = new int[Rows][Columns];
        System.out.println("Enter the elements of your array:");
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                arr[i][j] = cin.nextInt();

            }
        }
        int[][] Transpose_Matrix = new int[Columns][Rows];
        for (int i = 0; i < Columns; i++) {
            for (int j = 0; j < Rows; j++) {
                Transpose_Matrix[i][j] = arr[j][i];
                System.out.print(Transpose_Matrix[i][j] + " ");

            }
            System.out.println();
        }
        cin.close();
    }
}
