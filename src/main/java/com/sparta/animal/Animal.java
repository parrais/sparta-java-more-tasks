package com.sparta.animal;

import java.time.LocalDate;
import java.time.Period;

public abstract class Animal {
    String name;
    LocalDate birthdate;

    public Animal(String name, int birthYear, int birthMonth, int birthDay) {
        this.name = name;
        this.birthdate = LocalDate.of(birthYear, birthMonth, birthDay);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        Period age = Period.between(birthdate,LocalDate.now());
        int ageInYears = age.getYears();
        return ageInYears;
    }

    @Override
    public String toString() {
        return "This animal's name is " + getName() + " and they are " + getAge() + " year(s) old.";
    }

    abstract String speak();
}
