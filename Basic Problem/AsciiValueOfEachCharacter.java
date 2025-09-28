import java.util.Scanner;

public class AsciiValueOfEachCharacter {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = cin.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
            System.out.print(str.codePointAt(i) + " ");

        }
        cin.close();
    }
}
