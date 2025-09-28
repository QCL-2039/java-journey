import java.util.Scanner;

public class CompoundCalculator {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        // Input principal
        System.out.print("Enter your capital: ");
        double capital = cin.nextDouble();
        if (capital <= 0) {
            System.out.println("Capital must be positive.");
            cin.close();
            return;
        }

        // Input time in years
        System.out.print("Enter the number of years: ");
        double years = cin.nextDouble();
        if (years <= 0) {
            System.out.println("Number of years must be positive.");
            cin.close();
            return;
        }

        // Input interest rate
        System.out.print("Enter the interest rate (in %): ");
        double rate = cin.nextDouble();
        if (rate < 0) {
            System.out.println("Interest rate cannot be negative.");
            cin.close();
            return;
        }
        rate /= 100; // Convert percentage to decimal

        // Input number of times compounded per year
        System.out.print("Enter the number of times interest is compounded per year: ");
        int compound = cin.nextInt();
        if (compound <= 0) {
            System.out.println("Compounding frequency must be positive.");
            cin.close();
            return;
        }

        // Calculate final amount
        double finalAmount = capital * Math.pow(1 + rate / compound, compound * years);

        // Display result formatted to 2 decimal places
        System.out.printf("Final amount after %.2f years: %.2f%n", years, finalAmount);

        cin.close();
    }
}