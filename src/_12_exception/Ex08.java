package _12_exception;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bank = new BankAccount("0001", "nguyen van a");
        bank.setBalance(120000);
        try {
            System.out.println("Enter withdraw amount: ");
            double amount = scanner.nextDouble();
            bank.fundout(amount);
            System.out.println("Transaction successfully. Your balance is " + bank.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction fail." +  e.getMessage());
        }
        scanner.close();
    }
}

class BankAccount {
    private double balance;
    private String accountNumber;
    private String accountName;

    public BankAccount(String accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void fundout(double amount) throws InsufficientFundsException {
        if (amount < 0 || amount > this.getBalance()) {
            throw new InsufficientFundsException("Invalid amount. Amount must be greater than 0 and less than your balance");
        }
        this.balance -= amount;
    }
}


class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super();
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}