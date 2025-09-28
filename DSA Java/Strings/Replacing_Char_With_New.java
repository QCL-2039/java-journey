import java.util.Scanner;

public class Replacing_Char_With_New {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = cin.nextLine();

        String s = new String(str.replace("e", "i"));
        System.out.println("After replacing:" + s);
        cin.close();
    }
}
