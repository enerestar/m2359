package com.m2359;

import com.m2359.IAnimal.CanSwim;
import com.m2359.IAnimal.CanWalk;
import com.m2359.utils.Messages;

public class Duck extends Animal implements CanWalk, CanSwim {

    @Override
    public String getSound() {
        return "Quack, quack";
    }

    @Override
    public String swim() {
        return Messages.getMessages().swim;
    }

    @Override
    public String walk() {
        return Messages.getMessages().walk;
    }
}
