import java.util.Scanner;

public class Search_Element_Arr {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the size of your array:");
        int size = cin.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element for your array:");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int target = cin.nextInt();
        boolean flag = false;
        int idx = 0;
        for (int j = 0; j < size; j++) {
            if (arr[j] == target) {
                flag = true;
                idx = j;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Element found at index:" + idx);
        } else {
            System.out.println("Element not found.");
        }
        cin.close();

    }
}
