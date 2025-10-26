import java.util.Scanner;
import java.util.Random;

public class Index_Of_Elem_Arr {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter the size of your array:");
        int size = cin.nextInt();

        int[] arr = new int[size];
        int index = 0;
        System.out.println("Elements of your array:");
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(50);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nEnter the element to be searched:");
        int elm = cin.nextInt();
        boolean isFound = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == elm) {
                index = i;
                isFound = true;
                System.out.println((elm + " found at index:" + index));
                // break;
            }
        }
        // if (isFound) {
        // System.out.println((elm + " found at index:" + index));
        // } else {
        // System.out.println(elm + " not found!");
        // }
        if (!isFound) {
            System.out.println(elm + " not found!");
        }
        cin.close();
    }
}
