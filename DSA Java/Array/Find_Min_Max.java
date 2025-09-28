import java.util.Scanner;

public class Find_Min_Max {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the size of your array:");
        int size = cin.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of your array:");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
            if (min >= arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Largest number in the array is:" + max + " and Smallest number is:" + min);
        cin.close();

    }
}
