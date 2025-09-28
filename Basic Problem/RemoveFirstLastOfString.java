import java.util.Scanner;

public class RemoveFirstLastOfString {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = cin.nextLine();
        if (str.isEmpty() || str.length() <= 2) {
            System.out.println("Enter a valid String.");
        } else {
            String strNew = str.substring(1, str.length() - 1);
            System.out.println(strNew);
        }

        cin.close();
    }
}
