package com.m2359.fish;

import com.m2359.Animal;
import com.m2359.IAnimal.CanSwim;
import com.m2359.utils.Messages;

public class Dolphin extends Animal implements CanSwim {
    @Override
    public String swim() {
        return Messages.getMessages().swim;
    }
}
