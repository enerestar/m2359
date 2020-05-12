package com.m2359;

import com.m2359.IAnimal.CanSwim;
import com.m2359.IAnimal.CanWalk;

public class Dog extends Animal implements CanWalk, CanSwim {

    @Override
    public String getSound() {
        return "Woof, woof";
    }

    @Override
    public String swim() {
        return null;
    }

    @Override
    public String walk() {
        return null;
    }
}
