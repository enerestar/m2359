package com.m2359;

import com.m2359.IAnimal.CanWalk;

public class Cat extends Animal implements CanWalk {

    @Override
    public String getSound() {
        return "Meow";
    }

    @Override
    public String walk() {
        return null;
    }
}
