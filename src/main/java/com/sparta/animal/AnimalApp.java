package com.sparta.animal;

import java.util.ArrayList;

public class AnimalApp {
    static void main() {
        ArrayList<Animal> pets = new ArrayList<Animal>();

        pets.add(new Cat("Tigger",2005,4,24,"biscuits"));
        pets.add(new Cat("Jasper",2005,4,24,"chicken"));
        pets.add(new Cat("Percy",2023,3,23,"whiskas"));
        pets.add(new Cat("Cosmo",2023,3,23,"crunchies"));
        pets.add(new Cat("Brian", 2015,10,21,"meat"));
        pets.add(new Dog("Archie",2015,10,20,"fetch"));

        for (Animal pet : pets) {
            System.out.println(pet);
        }
    }
}
