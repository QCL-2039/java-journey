import java.util.Scanner;
import java.util.Random;

public class Num_Guess_Game {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter the Top range for Random Number:");
        int top_range = cin.nextInt();
        int count = 0;

        if (top_range <= 0) {
            System.out.println("Enter number greater than Zero.");
        } else {
            while (true) {
                int random_num = rand.nextInt(top_range);
                count++;
                System.out.println("Enter your guess:");
                int guess = cin.nextInt();
                if (guess == random_num) {
                    System.out.println("You got it right");

                    break;
                } else if (guess > random_num) {
                    System.out.println("You guessed above than that number.");
                } else {
                    System.out.println("You guessed lower than that number.");
                }

            }
            System.out.println("You got it in:" + count + " tries");
        }

        cin.close();
    }
}
