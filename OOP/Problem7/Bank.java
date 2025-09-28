package OOP.Problem7;

import java.util.ArrayList;

public class Bank {
    public static Account addAccount(String holderName, double balance) {

        if (holderName != null && balance >= 1000) {
            return new Account(holderName, balance);

        } else {
            System.out.println("Holder Name can't be null or Balance can't be less than 1000.");
            return null;
        }
    }

    public static void removeAccount(ArrayList<Account> accounts, String accountNumber) {
        boolean found = false;
        for (Account a : accounts) {
            if (accountNumber.equalsIgnoreCase(a.accountNumber)) {
                accounts.remove(a);
                System.out.println("Account removed with account:" + accountNumber);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Account not found with account Number: " + accountNumber);
        }
    }

    public static void showAllAccount(ArrayList<Account> accounts) {
        for (Account a : accounts) {
            a.showAccount();
        }
    }

    public static void main(String[] args) {

        ArrayList<Account> accountList = new ArrayList<>();
        Account a = addAccount("Sohel Rana", 1000000);
        accountList.add(a);
        Account b = addAccount("Mehera Meher", 200000);
        accountList.add(b);
        showAllAccount(accountList);
        removeAccount(accountList, "Bank10101011");
        showAllAccount(accountList);
        a.deposit(2000);
        a.showAccount();

    }

}
