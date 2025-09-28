import java.util.Scanner;

public class Check_Arr_SortAsc {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the size of your array:");
        int size = cin.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of your array:");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }
        boolean isAseceding = true;
        int track = arr[0];
        for (int j = 0; j < size; j++) {
            if (track <= arr[j]) {
                track = arr[j];

            } else {
                isAseceding = false;
            }
        }
        if (isAseceding) {
            System.out.println("The array is sorted in Ascending order.");
        } else {
            System.out.println("Array is not sorted in Ascending order.");
        }

        cin.close();
    }
}
