import java.util.Scanner;

public class Plaindrome_String {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your String:");
        String str = cin.nextLine();
        String test = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            test += str.charAt(i);
        }
        System.out.println(test);
        if (test.equals(str)) {
            System.out.println(str + " is a Palindrome string");
        } else {
            System.out.println(str + " is not a Plaindrom string.");
        }

        cin.close();
    }

}
