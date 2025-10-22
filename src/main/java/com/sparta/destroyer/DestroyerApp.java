package com.sparta.destroyer;

import java.util.Scanner;

public class DestroyerApp {
    static void main() {
        Ship destroyer = new Ship();
        System.out.println("** Welcome to Destroyer! **");
        outputMap(destroyer.getShipMap());
        int destroyedSections = 0;
        Scanner scanner = new Scanner(System.in);
        while(destroyedSections < 2){
            int[][] shipMap = takeShot(destroyer.getShipMap(), scanner);
            destroyer.setShipMap(shipMap);
            destroyedSections = checkShip(destroyer.getShipMap());
        }
        scanner.close();
        System.out.println("You sank the destroyer!");
    }

    private static int[][] takeShot(int[][] map, Scanner scanner){
        String shotString = getStringEntry("Enter a shot (r c): ", scanner);
        int row = shotString.charAt(0) - '0';
        int column = shotString.charAt(2) - '0';
        System.out.println("row " + row + " column " + column);
        map[row-1][column-1] += 6;
        outputMap(map);
        if(map[row-1][column-1] == 7) {
            System.out.println("Well done you hit!");
        } else {
            System.out.println("Sorry you missed.");
        }
        return map;
    }

    private static void outputMap(int[][] map) {
        StringBuilder displayGrid = new StringBuilder();
        displayGrid.append("  1  2  3  4  5\n");
        for (int i = 0; i < map.length; i++) {
            displayGrid.append(i+1);
            for (int j = 0; j < map[i].length; j++) {
                displayGrid.append("[");
                if (map[i][j] == 6){displayGrid.append("M");}
                else if (map[i][j] == 7){displayGrid.append("H");}
                else {displayGrid.append(" ");}
                displayGrid.append("]");
            }
            displayGrid.append("\n");
        }
        System.out.print(displayGrid.toString());
    }

    private static String getStringEntry(String message, Scanner scan) {
        System.out.print(message);
        return scan.nextLine();
    }

    private static int checkShip(int[][] map) {
        int hitCounter = 0;
        for (int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                if (map[i][j] == 7){
                    hitCounter++;
                }
            }
        }
        return hitCounter;
    }
}
