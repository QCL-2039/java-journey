
//  Write a program to enter the numbers till the user wants and at the end it 
// should display the count of positive, negative and zeros entered. 
import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int countP = 0;
        int countN = 0;
        int countZ = 0;
        int button;
        do {
            System.out.println("Enter a number: ");
            int num = cin.nextInt();
            if (num % 2 == 0) {
                countP++;
            } else if (num % 2 != 0) {
                countN++;
            } else {
                countZ++;
            }
            System.out.println("Want to continue? 1-Yes 0-No:");
            button = cin.nextInt();
        } while (button == 1);
        System.out.println("Postive Numbers you entered: " + countP);
        System.out.println("Negative Numbers you entered: " + countN);
        System.out.println("Zeros  you entered: " + countZ);
        cin.close();
    }
}
