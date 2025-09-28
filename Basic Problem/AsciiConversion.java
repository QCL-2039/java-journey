import java.util.Scanner;

public class AsciiConversion {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your string:");
        String s = cin.nextLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.println(i + " " + s.charAt(i) + " " + s.codePointAt(i));
            // System.out.print(i + " " + s.charAt(i) + " " + s.codePointAt(i) + "\n");
            // System.out.printf(i + " " + s.charAt(i) + " " + s.codePointAt(i) + "\n");
        }
        cin.close();
    }
}
