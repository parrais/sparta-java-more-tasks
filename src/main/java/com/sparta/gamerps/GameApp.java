package com.sparta.gamerps;

import java.util.Scanner;

public class GameApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int playerScore = 0;
        int computerScore = 0;
        System.out.println("Let's play Rock Paper Scissors!");
        while (playerScore < 3 && computerScore < 3) {
            String result = playRound(scanner);
            if (result.equals("player")) {
                playerScore++;
            } else if (result.equals("computer")) {
                computerScore++;
            }
            System.out.println("The current score is: Player " + playerScore + ", Computer " + computerScore);
        }
        if (playerScore == 3) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Computer wins!");
        }
    }

    private static String playRound(Scanner scanner) {
        String computerInput = "scissors";
        int randomNum = (int)(Math.random() * 3);
        switch(randomNum){
            case 0:
                computerInput = "rock";
                break;
            case 1:
                computerInput = "paper";
                break;
            default:
                break;
        }
        String playerInput = getStringEntry("Please input a move (rock, paper, scissors): ", scanner).trim().toLowerCase();
        System.out.println("You played " + playerInput + " and your opponent played " + computerInput + ".");
        String winner = "draw";
        if (playerInput.equals("scissors") && computerInput.equals("paper")
        || playerInput.equals("paper") && computerInput.equals("rock")
        || playerInput.equals("rock") && computerInput.equals("scissors")) {
            winner = "player";
            System.out.println("You won this round.");
        } else if (playerInput.equals("scissors") && computerInput.equals("rock")
                || playerInput.equals("paper") && computerInput.equals("scissors")
                || playerInput.equals("rock") && computerInput.equals("paper")) {
            winner = "computer";
            System.out.println("Your opponent won this round.");
        } else {
            System.out.println("The round was drawn.");
        }
        return winner;
    }

    private static String getStringEntry(String message, Scanner scan) {
        System.out.print(message);
        return scan.nextLine();
    }
}
