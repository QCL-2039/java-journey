import java.util.Scanner;

public class EqualEqualString {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String correctPassword = "invisible";
        System.out.println("Enter your password");
        String str = cin.nextLine();

        if (str.compareTo(correctPassword) == 0) {
            System.out.println("Logged in Successfully.");
        } else {
            System.out.println("Incorrect password.");
        }
        cin.close();
    }
}
