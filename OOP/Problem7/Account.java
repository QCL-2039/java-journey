package OOP.Problem7;

public class Account {
    public static int accountCount = 101010;
    public String accountNumber;
    public String holderName;
    private double balance;

    public Account(String holderName, double balance) {
        this.accountNumber = "Bank" + accountCount++;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
        System.out.println("Balance Deposited.New Balance: " + balance);
    }

    public void withDraw(double balance) {
        this.balance -= balance;
        System.out.println("Withdrawn Successfully.New Balance: " + balance);
    }

    public void showAccount() {
        System.out.println(
                "Account Number: " + accountNumber + " Account Holder Name: " + holderName + " Balance: " + balance);
    }

}
