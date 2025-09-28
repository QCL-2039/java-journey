import java.util.Scanner;

public class Spiral_Print_Arr {
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
        int row_start = 0;
        int row_end = Rows - 1;
        int column_start = 0;
        int column_end = Columns - 1;

        while (row_start <= row_end && column_start <= column_end) {
            for (int i = column_start; i <= column_end; i++) {
                System.out.print(arr[row_start][i] + " ");
            }
            row_start++;

            for (int j = row_start; j <= row_end; j++) {
                System.out.print(arr[j][column_end] + " ");
            }
            column_end--;
            for (int k = column_end; k >= column_start; k--) {
                System.out.print(arr[row_end][k] + " ");
            }
            row_end--;
            for (int l = row_end; l >= row_start; l--) {
                System.out.print(arr[l][column_start] + " ");
            }
            column_start++;
            System.err.println();

        }
        cin.close();
    }
}
