package com.sparta.animal;

public class Cat extends Animal {
    String favouriteFood;

    public Cat(String name, int birthYear, int birthMonth, int birthDay, String favouriteFood) {
        super(name, birthYear, birthMonth, birthDay);
        this.favouriteFood = favouriteFood;
    }

    @Override
    public String toString() {
        return super.toString() + " They are a cat whose favourite food is " + favouriteFood + " and they say '" + speak() + "'." ;
    }

    @Override
    String speak() {
        return "miaow";
    }
}
