import java.util.Scanner;

public class Search_Element_Arr_Improve {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the size of your array:");
        int size = cin.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of your array:");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int target = cin.nextInt();
        for (int j = 0; j < size; j++) {
            if ((arr[j] ^ target) == 0) {
                System.out.println("Element found at the index:" + j);
                cin.close();
                return;
            }

        }
        System.out.println("Element not found.");
        cin.close();
    }
}
