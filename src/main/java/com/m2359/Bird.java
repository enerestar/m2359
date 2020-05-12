package com.m2359;

import com.m2359.IAnimal.CanFly;
import com.m2359.IAnimal.CanSing;
import com.m2359.IAnimal.CanWalk;

public class Bird extends Animal implements CanWalk, CanFly, CanSing {
    @Override
    public String fly() {
        return "I can fly";
    }

    @Override
    public String sing() {
        return "I can sing";
    }

    @Override
    public String walk() {
        return "I can walk";
    }
}
