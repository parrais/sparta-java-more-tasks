package com.sparta.animal;

public class Dog extends Animal {
    String favouriteGame;

    public Dog(String name, int birthYear, int birthMonth, int birthDay, String favouriteGame) {
        super(name, birthYear, birthMonth, birthDay);
        this.favouriteGame = favouriteGame;
    }

    @Override
    public String toString() {
        return super.toString() + " They are a dog whose favourite game is " + favouriteGame + " and they say '" + speak() + "'." ;
    }

    @Override
    String speak() {
        return "woof";
    }
}