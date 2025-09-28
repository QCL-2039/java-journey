import java.util.Scanner;

public class Search_Elem_In_Matrix {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the size of your matrix (Rows x Columns):");
        int Rows = cin.nextInt();
        int Columns = cin.nextInt();
        int[][] matrix = new int[Rows][Columns];
        System.out.println("Enter the elements of your matrix:");
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                matrix[i][j] = cin.nextInt();
            }
        }
        System.out.println("Enter the elements to be searched:");
        int elem = cin.nextInt();
        boolean track = false;
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                if (elem == matrix[i][j]) {
                    System.out.println(elem + " is found at index:" + i + " " + j);
                    track = true;
                    break;
                }
            }
            if (track) {
                break;
            }
        }
        if (!track) {
            System.out.println(elem + " not found!");
        }
        cin.close();
    }
}
