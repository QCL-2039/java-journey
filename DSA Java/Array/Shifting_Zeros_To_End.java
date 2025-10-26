import java.util.Scanner;
//import java.util.Random;

// public class Shifting_Zero_To_End {

// public static void shiftZeorToEnd(int[] arr) {
// sortArray(arr);
// if (arr != null && arr.length != 0) {
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] == 0) {
// int temp = arr[i];
// arr[arr.length - 1 - i] = temp;

// }
// }
// }
// showArray(arr);
// }

// public static void sortArray(int[] arr) {
// for (int i = 0; i < arr.length - 1; i++) {
// for (int j = 0; j < arr.length - i - 1; j++) {
// if (arr[j] > arr[j + 1]) {
// int temp = arr[j];
// arr[j] = arr[j + 1];
// arr[j + 1] = temp;

// }
// }
// }
// System.out.println("\nSorted Array:");
// showArray(arr);
// }

// public static void showArray(int[] arr) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// }

// public static void main(String[] args) {
// Scanner cin = new Scanner(System.in);
// Random rand = new Random();
// System.out.println("Enter the size of your array:");
// int size = cin.nextInt();
// int[] arr = new int[size];

// for (int i = 0; i < arr.length; i++) {
// arr[i] = rand.nextInt(5);
// }
// // showArray(arr);
// // sortArray(arr);
// shiftZeorToEnd(arr);
// cin.close();

// }
// }
public class Shifting_Zeros_To_End {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        // Random rand = new Random();
        // System.out.println("Enter the size of your array:");

        int[] arr = { 8, 1, 0, 2, 1, 0, 3 };

        for (int i = 0; i < arr.length - 1; i++) {
            {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] == 0) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }

            }
        }
        System.out.println("After placing Zero's to the end:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        cin.close();

    }
}
