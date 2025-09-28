import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args)

    {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = cin.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            if (num == 0 || num == 1) {
                System.out.println(num + " is not prime nor Coposite.");
            } else {
                System.out.println(num + " is prime number.");
            }
        } else {
            System.out.println(num + " is a composite number.");
        }
        cin.close();
    }
}
