package com.m2359;

import com.m2359.IAnimal.CanWalk;

public class Chicken extends Animal implements CanWalk {

    @Override
    public String getSound() {
        return "Cluck, cluck";
    }

    @Override
    public String walk() {
        return "I can walk";
    }
}
