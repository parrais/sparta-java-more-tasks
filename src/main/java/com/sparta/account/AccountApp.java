package com.sparta.account;

public class AccountApp {
    static void main() {
        BankAccount percy = new BankAccount("12345","Percy Buckets",123.45);
        BankAccount cosmo = new BankAccount("67890","Cosmo Cat",100.00);
        BankAccount archie = new BankAccount("13579", "Archie Dog", 1000.00);

        percy.displayInfo();
        cosmo.displayInfo();
        archie.displayInfo();

        percy.deposit(500);
        percy.displayInfo();
        percy.deposit(0);
        percy.displayInfo();
        percy.deposit(-1);
        percy.displayInfo();

        archie.withdraw(-1);
        archie.displayInfo();
        archie.withdraw(0);
        archie.displayInfo();
        archie.withdraw(2000);
        archie.displayInfo();
        archie.withdraw(100);
        archie.displayInfo();

        cosmo.applyInterest();
        cosmo.displayInfo();
        cosmo.deposit(230.83);
        cosmo.displayInfo();
        cosmo.applyInterest();
        cosmo.displayInfo();
    }
}
