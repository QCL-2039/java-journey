import java.util.Scanner;

public class Username_from_Email {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your e-mail address:");
        String mail = cin.next();
        String username = "";
        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '@') {
                System.out.println(username);
                break;
            } else {
                username += mail.charAt(i);
            }
        }

        cin.close();
    }
}
