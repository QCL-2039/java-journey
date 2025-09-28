import java.util.Scanner;

public class Basic_Array {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the size of your array:");
        int size = cin.nextInt();
        int[] arr = new int[size];
        System.out.println("Memory location of this array:" + arr);
        System.out.println("Enter the elements of your array:");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
            System.out.println(arr[i] + " ");
        }
        cin.close();
    }

}
