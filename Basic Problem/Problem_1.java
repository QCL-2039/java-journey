import java.util.Scanner;

// Make a menu driven program. The user can enter 2 numbers, either 1 or O.
// If the user enters 1 then keep taking input from the user for a student's
// marks(out of 100).
// If they enter O then stop.
// If he/ she scores :
// Marks -> print "This is Good"
// 89 Marks 60 -> print "This is also Good"
// 59 Marks O -> print "This is Good as well"
// Because marks don't matter but our effort does.
public class Problem_1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int button;
        do {
            System.out.println("Enter your marks:");
            int marks = cin.nextInt();
            if (marks >= 90 && marks <= 100) {
                System.out.println("This is Good.");
            } else if (marks <= 89 && marks >= 60) {
                System.out.println("This is also good.");
            } else if (marks <= 59 && marks >= 0) {
                System.out.println("This is good as well");
            } else {
                System.out.println("Invalid marks");
            }
            System.out.println("Want to continue?(1-Yes / 0-NO)");
            button = cin.nextInt();
        } while (button == 1);
        cin.close();
    }
}
