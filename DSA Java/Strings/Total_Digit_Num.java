import java.util.Scanner;

public class Total_Digit_Num {
    public static void main(String[] args)

    {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = cin.nextInt();
        String str = Integer.toString(num);
        System.out.println("Total Digit in your number:" + str.length());
        // int sum = 0;
        // for (int i = 0; i < str.length(); i++) {
        // sum += str.charAt(i);
        // }
        // System.out.println(sum);
        cin.close();
    }
}
