import java.util.Scanner;

public class UsernameDomain {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your email:");
        String userEmail = cin.nextLine();
        if (userEmail.contains("@gmail.com")) {
            String userName = userEmail.substring(0, userEmail.indexOf("@"));
            String userDomain = userEmail.substring(userEmail.indexOf("@") + 1);
            System.out.println("UserName is: " + userName);
            System.out.println("UserDomain is: " + userDomain);
        } else {
            System.out.println("Invalid email");
        }

        cin.close();
    }
}
