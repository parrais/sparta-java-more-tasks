package com.sparta.animal;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class AnimalAppTest {

    @Test
    @DisplayName("Cat returns an animal that says miaow")
    void catSaysMiaow() {
        Animal testCat = new Cat("name",2025,1,1,"food");
        MatcherAssert.assertThat(testCat.speak(), equalTo("miaow"));
    }

    @Test
    @DisplayName("Dog returns an animal that says woof")
    void dogSaysWoof() {
        Animal testDog = new Dog("name",2025,1,1,"game");
        MatcherAssert.assertThat(testDog.speak(), equalTo("woof"));
    }

    @Test
    @DisplayName("Cat born 2025 returns age 0")
    void catAgeZero() {
        Animal testCat = new Cat("name",2025,1,1,"food");
        MatcherAssert.assertThat(testCat.getAge(), equalTo(0));
    }

    @Test
    @DisplayName("Cat born 2020 returns age 5")
    void catAgeFive() {
        Animal testCat = new Cat("name",2020,1,1,"food");
        MatcherAssert.assertThat(testCat.getAge(), equalTo(5));
    }

    @Test
    @DisplayName("Cat displays favourite food")
    void catFaveFood() {
        Animal testCat = new Cat("name",2020,12,31,"testFood");
        MatcherAssert.assertThat(testCat.toString(), containsString("favourite food"));
        MatcherAssert.assertThat(testCat.toString(), containsString("testFood"));
    }

    @Test
    @DisplayName("Dog displays favourite game")
    void dogFaveGame() {
        Animal testDog = new Dog("name",2025,1,1,"testGame");
        MatcherAssert.assertThat(testDog.toString(), containsString("favourite game"));
        MatcherAssert.assertThat(testDog.toString(), containsString("testGame"));
    }

}
