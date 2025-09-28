import java.util.Scanner;

public class Quiz_Game_Project {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = cin.nextLine();
        System.out.println("Welcome," + name + " in My First Java Project.");
        System.out.println("Do you want to play Math Quiz game:(Yes/No)");
        String answer = cin.nextLine();
        int count = 0;
        if (!answer.equals("Yes")) {
            System.out.println("You quit the game.");

        } else {

            System.out.println("1.What is 5+7 ?");
            float ans = cin.nextInt();
            if (ans == (5 + 7)) {
                System.out.println("Your answer is correct.");
                count++;
            } else {
                System.out.println("Your answer is incorrect!");
            }

            System.out.println("2.What is 5-7 ?");
            ans = cin.nextInt();
            if (ans == (5 - 7)) {
                System.out.println("Your answer is correct.");
                count++;
            } else {
                System.out.println("Your answer is incorrect!");
            }

            System.out.println("3.What is 5*7 ?");
            ans = cin.nextInt();
            if (ans == (5 * 7)) {
                System.out.println("Your answer is correct.");
                count++;
            } else {
                System.out.println("Your answer is incorrect!");
            }

            System.out.println("4.What is 25.0/5 ?");
            ans = cin.nextFloat();
            if (ans == (25 / 5)) {
                System.out.println("Your answer is correct.");
                count++;
            } else {
                System.out.println("Your answer is incorrect!");
            }

            System.out.println("5.What is 5*7/2 ?");
            ans = cin.nextFloat();
            if (ans == (5.0 * 7 / 2)) {
                System.out.println("Your answer is correct.");
                count++;
            } else {
                System.out.println("Your answer is incorrect!");
            }

            System.out.println("Your correct answer is :" + count);
            if (count == 5) {
                System.out.println(name + " you're an extra ordinary!");
            }

        }
        cin.close();

    }
}
