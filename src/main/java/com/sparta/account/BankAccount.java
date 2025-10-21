package com.sparta.account;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private double interestRate = 0.025;

    public BankAccount(){}

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit of " + amount + " added to balance.");
        } else {
            System.out.println("Invalid deposit amount: " + amount);
        }
    }

    void withdraw(double amount) {
        if (amount >= this.balance) {
            System.out.println("Invalid withdrawal - insufficient balance.");
        } else if (amount > 0 ) {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " made from account.");
        } else {
            System.out.println("Invalid withdrawal amount: " + amount);
        }
    }

    void displayInfo() {
        System.out.printf("Account number: %s%nHolder name: %s%nBalance: %.2f%n%n", accountNumber, accountHolder, balance);
    }

    void applyInterest() {
        this.balance = Math.ceil(100 * (balance * (1 + this.interestRate)))/100;
        System.out.println("Interest applied.");
    }

}
