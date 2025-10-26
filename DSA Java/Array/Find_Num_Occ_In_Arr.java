import java.util.Scanner;
import java.util.Random;

public class Find_Num_Occ_In_Arr {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter the size of your array:");
        int size = cin.nextInt();

        int[] arr = new int[size];
        int count = 0;
        System.out.println("Elements of your array:");
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(50);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nEnter the element to be searched:");
        int elm = cin.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr[i] == elm) {
                count++;
            }
        }
        System.out.println(elm + " is found:" + count + " time's");
        cin.close();
    }
}
