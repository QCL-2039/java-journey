import java.util.Scanner;

public class Printing_Characters {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your string:");
        String s = cin.nextLine();
        String s2 = s;
        String s3 = "Sohel Rana";
        if (s2.equals(s3)) {
            System.out.println("Ok");
        } else {
            System.out.println("Not");
        }
        // for (int i = 0; i < s2.length(); i++)

        // {
        // System.out.println(s2.charAt(i));
        // }
        cin.close();
    }
}