package com.m2359;

import com.m2359.IAnimal.CanFly;
import com.m2359.IAnimal.CanWalk;

public class Parrot extends Animal implements CanFly, CanWalk {

    private String livesNear;

    Parrot() {
    }

    Parrot(Animal animal) {
        this.livesNear = animal.getSound();
    }
    @Override
    public String getSound() {
        return this.livesNear;
    }

    @Override
    public String fly() {
        return "I can fly";
    }

    @Override
    public String walk() {
        return "I can walk";
    }
}
