package com.sparta.account;

public class AccountApp {
    static void main() {
        BankAccount percy = new BankAccount("12345","Percy Buckets",123.45);
        BankAccount cosmo = new BankAccount("67890","Cosmo Cat",100.00);
        BankAccount archie = new BankAccount("13579", "Archie Dog", 1000.00);

        percy.displayInfo();
        cosmo.displayInfo();
        archie.displayInfo();

        cosmo.deposit(500);
        cosmo.displayInfo();
        cosmo.deposit(0);
        cosmo.displayInfo();
        cosmo.deposit(-1);
        cosmo.displayInfo();

        archie.withdraw(-1);
        archie.displayInfo();
        archie.withdraw(0);
        archie.displayInfo();
        archie.withdraw(2000);
        archie.displayInfo();
        archie.withdraw(100);
        archie.displayInfo();
    }
}
