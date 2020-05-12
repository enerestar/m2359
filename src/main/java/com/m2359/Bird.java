package com.m2359;

import com.m2359.IAnimal.CanFly;
import com.m2359.IAnimal.CanSing;
import com.m2359.IAnimal.CanWalk;
import com.m2359.utils.Messages;

public class Bird extends Animal implements CanWalk, CanFly, CanSing {
    @Override
    public String fly() {
        return Messages.getMessages().fly;
    }

    @Override
    public String sing() {
        return Messages.getMessages().sing;
    }

    @Override
    public String walk() {
        return Messages.getMessages().walk;
    }
}
