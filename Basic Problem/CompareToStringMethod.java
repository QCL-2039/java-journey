import java.util.Scanner;

public class CompareToStringMethod {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        // Input first string
        System.out.print("Enter String 1: ");
        String str1 = cin.nextLine();
        System.out.println("Length of String 1: " + str1.length());

        // Input second string
        System.out.print("Enter String 2: ");
        String str2 = cin.nextLine();
        System.out.println("Length of String 2: " + str2.length());

        // Compare strings lexicographically
        int result = str1.compareTo(str2);

        if (result == 0) {
            System.out.println("The strings are the same.");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" is lexicographically greater than \"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\" is lexicographically smaller than \"" + str2 + "\"");
        }

        cin.close();
    }
}
