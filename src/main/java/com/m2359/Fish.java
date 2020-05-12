package com.m2359;

import com.m2359.IAnimal.CanSwim;

public class Fish extends Animal implements CanSwim {

    @Override
    public String swim() {
        return "I can swim";
    }
}
