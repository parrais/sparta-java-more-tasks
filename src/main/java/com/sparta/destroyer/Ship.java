package com.sparta.destroyer;

import java.util.Random;

public class Ship {
    private int[][] shipMap = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};

    public Ship() {
        this.shipMap = shipMap;
        int topLeftRowIndex = new Random().nextInt(4);
        int topLeftColumnIndex = new Random().nextInt(4);
        int orientation = new Random().nextInt(2);
        this.shipMap[topLeftRowIndex][topLeftColumnIndex] = 1;
        if (orientation == 0) {
            this.shipMap[topLeftRowIndex][topLeftColumnIndex + 1] = 1;
        } else {
            this.shipMap[topLeftRowIndex + 1][topLeftColumnIndex] = 1;
        }

    }

    public int[][] getShipMap() {
        return shipMap;
    }

    public void setShipMap(int[][] shipMap) {
        this.shipMap = shipMap;
    }
}