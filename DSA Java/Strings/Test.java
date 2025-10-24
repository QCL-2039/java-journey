import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println(("Enter your number:"));
        String ch = cin.nextLine();
        char c = ch.charAt(0);
        int sum = 0;
        sum += c;
        System.out.println(sum);

        cin.close();

    }
}
