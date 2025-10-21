package com.sparta.highlow;

import java.util.Random;
import java.util.Scanner;

public class HighLowApp {
    static void main() {
        int firstCard = drawCard();
        Scanner scanner = new Scanner(System.in);
        String decision = getStringEntry("Do you think the next card will be higher or lower? Enter your choice: ", scanner).trim().toLowerCase();
        scanner.close();
        int secondCard = drawCard();
        if (decision.equals("higher") && secondCard > firstCard || decision.equals("lower") && secondCard < firstCard) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }

    private static int drawCard(){
        int card = new Random().nextInt(13) + 1;
        switch(card) {
            case 1:
                System.out.println("You drew an ace...");
                break;
            case 11:
                System.out.println("You drew a jack...");
                break;
            case 12:
                System.out.println("You drew a queen...");
                break;
            case 13:
                System.out.println("You drew a king...");
                break;
            default:
                System.out.println("You drew a " + card + "...");
                break;
        }
        return card;
    }

    private static String getStringEntry(String message, Scanner scan) {
        System.out.print(message);
        return scan.nextLine();
    }
}
