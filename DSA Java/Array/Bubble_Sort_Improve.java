import java.util.Scanner;

public class Bubble_Sort_Improve {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the size of your array:");
        int size = cin.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements for your array:");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }
        int count = 0;
        boolean swapped;
        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    count++;
                }
            }
            if (swapped == false) {
                break;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nThis array needs:" + count + " swapped.");

        cin.close();
    }
}
