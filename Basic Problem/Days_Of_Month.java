import java.util.Scanner;

public class Days_Of_Month {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your month:");
        String month = cin.nextLine();

        switch (month) {
            case "January":
            case "March":
            case "May":
            case "June":
            case "August":
            case "Octber":
            case "December":
                System.out.println("This month has 31 Days.");
                break;
            case "February":
                break;
            default:
                System.out.println("This month has 30 days.");
        }

        cin.close();
    }
}
