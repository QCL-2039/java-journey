import java.util.Scanner;
import java.util.Random;

public class Remove_Even_Int_From_Arr {
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
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("\nArray without the Even Elements:");
        int[] result = new int[count];
        int idx = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                result[idx] = arr[i];
                System.out.print(result[idx] + " ");
                idx++;
            }

        }
        cin.close();

    }

}
