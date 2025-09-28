import java.util.Scanner;

public class Find_Upper_Lower_Case {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your string:");
        String s = cin.nextLine();
        // Finding UpperCase with codePointAt();
        {
            for (int i = 0; i < s.length(); i++) {
                if (s.codePointAt(i) > 65 && s.codePointAt(i) < 90) {
                    System.out.println(i + " " + s.charAt(i) + " " + s.codePointAt(i));
                }
            }
        }
        // Finding UpperCase with charAt()
        {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) > 'A' && s.charAt(i) < 'Z') {
                    System.out.println(i + " " + s.charAt(i) + " " + s.codePointAt(i));
                }
            }
        }
        cin.close();
    }
}
