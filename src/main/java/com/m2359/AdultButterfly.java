package com.m2359;

import com.m2359.IAnimal.CanFly;
import com.m2359.utils.Messages;

public class AdultButterfly extends Butterfly implements CanFly {
    @Override
    public String fly() {
        return Messages.getMessages().fly;
    }
}
