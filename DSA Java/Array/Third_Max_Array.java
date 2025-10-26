import java.util.Scanner;
import java.util.Random;

public class Third_Max_Array {

    public static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void secondMax(int[] arr) {
        if (arr != null && arr.length != 0) {

            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            int thirdMax = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    thirdMax = secondMax;
                    secondMax = max;
                    max = arr[i];
                } else if (arr[i] > secondMax && arr[i] != max) {
                    secondMax = arr[i];
                } else if (arr[i] > thirdMax && arr[i] != secondMax) {
                    thirdMax = arr[i];
                }
            }
            System.out.println("\nMaxium value is:" + max);
            System.out.println("Second Maximum is:" + secondMax);
            System.out.println("Third Maximum is:" + thirdMax);

        } else {
            System.out.println("Invalid input!");
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter the size of your array:");
        int size = cin.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        showArray(arr);
        secondMax(arr);
        cin.close();
    }

}
