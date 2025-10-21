package com.sparta.password;

import java.util.Scanner;

public class PasswordCheckerApp {
    static void main(String[] args) {
        final String PWD = "Rocket";

        Scanner scanner = new Scanner(System.in);
        String userSubmission = getStringEntry("Please enter your password: ", scanner);
        scanner.close();

        if(userSubmission.equalsIgnoreCase(PWD)) {
            System.out.println("Password correct - welcome!");
        } else {
            System.out.println("Password incorrect - access denied.");
        }
    }

    private static String getStringEntry(String message, Scanner scan) {
        System.out.print(message);
        return scan.nextLine();
    }
}
