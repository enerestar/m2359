package com.m2359;

import com.m2359.IAnimal.CanWalk;
import com.m2359.utils.Messages;

public class Butterfly extends Animal implements CanWalk {

    @Override
    public String walk() {
        return Messages.getMessages().walk;
    }
}
