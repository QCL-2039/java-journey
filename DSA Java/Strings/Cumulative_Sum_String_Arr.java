import java.util.Scanner;

public class Cumulative_Sum_String_Arr {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the size of your array:");
        int size = cin.nextInt();
        String[] arr = new String[size];
        int total_sum = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = cin.next();
            total_sum += arr[i].length();
        }
        System.out.println("Cumulative sum of this array:" + total_sum);
        cin.close();
    }
}
