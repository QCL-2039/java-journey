import java.util.Scanner;
import java.util.Random;

public class Reverse_Array_Elements {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter the size of your array:");
        int size = cin.nextInt();

        int[] arr = new int[size];
        System.out.println("Elements of your array:");
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(50);
            System.out.print(arr[i] + " ");
        }

        // Reverse logic only loop through half the array
        for (int i = 0; i < size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = temp;
        }

        System.out.println("\nReversed Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        cin.close();
    }
}
