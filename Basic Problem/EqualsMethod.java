import java.util.Scanner;

public class EqualsMethod {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String systemPassword = "invisible";
        System.out.println("Enter your Password: ");
        String userPassword = cin.nextLine();
        if (systemPassword.equalsIgnoreCase(userPassword)) {
            System.out.println("Logged in Successfully.");
        } else {
            System.out.println("Wrong Password.");
        }
        cin.close();

    }

}