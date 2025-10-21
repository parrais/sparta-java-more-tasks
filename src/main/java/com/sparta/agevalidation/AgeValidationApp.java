package com.sparta.agevalidation;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeValidationApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (name.isEmpty()) {
            name = getStringEntry("Please enter your name: ", scanner);
            if(name.isEmpty()){System.out.println("You did not enter your name.");}
        }
        String dateString = getStringEntry("Please enter your date of birth (dd/mm/yyyy): ", scanner);
        scanner.close();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(dateString, formatter);
        boolean ageCheck = eighteenPlus(birthDate);
        System.out.println("Your name is " + name + " and you are " + (ageCheck ? "over 18." : "under 18."));
    }

    private static String getStringEntry(String message, Scanner scan) {
        System.out.print(message);
        return scan.nextLine();
    }

    private static boolean eighteenPlus(LocalDate birthDate) {
        Period age = Period.between(birthDate, LocalDate.now());
        return (age.getYears() >= 18);
    }

}
