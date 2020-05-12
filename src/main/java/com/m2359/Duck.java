package com.m2359;

import com.m2359.IAnimal.CanSwim;
import com.m2359.IAnimal.CanWalk;

public class Duck extends Animal implements CanWalk, CanSwim {

    @Override
    public String getSound() {
        return "Quack, quack";
    }

    @Override
    public String swim() {
        return "I can swim";
    }

    @Override
    public String walk() {
        return "I can walk";
    }
}
