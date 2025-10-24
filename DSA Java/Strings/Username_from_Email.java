// import java.util.Scanner;

// public class Username_from_Email {
//     public static void main(String[] args) {
//         Scanner cin = new Scanner(System.in);
//         System.out.println("Enter your e-mail address:");
//         String mail = cin.next();
//         String username = "";
//         for (int i = 0; i < mail.length(); i++) {
//             if (mail.charAt(i) == '@') {
//                 System.out.println(username);
//                 break;
//             } else {
//                 username += mail.charAt(i);
//             }
//         }

//         cin.close();
//     }
// }

import java.util.Scanner;

public class Username_from_Email {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your mail address:");
        String mail = cin.nextLine();
        String username = "";
        int sum = 0;
        int index = mail.indexOf("@");
        for (int i = 0; i < index; i++) {
            username += mail.charAt(i);
            sum += mail.charAt(i);
        }
        System.out.println(username);
        System.out.println(sum);// Result in integer value.Adding to int with char takes the ascii values.
        cin.close();
    }
}