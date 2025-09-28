
// An array with values to sort.
// An inner loop that goes through the array and swaps values if the first value is higher than the next value. This loop must loop through one less value each time it runs.
// An outer loop that controls how many times the inner loop must run. For an array with n values, this outer loop must run n-1 times.
import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the size of your array:");
        int size = cin.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of your array:");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }
        System.out.println("After the bubble sort:");
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        cin.close();
    }
}
