package com.m2359.chicken;

import com.m2359.utils.Messages;

public class Rooster extends Chicken {
    @Override
    public String getSound() {
        return Messages.getMessages().cock_a_doodle_do;
    }
}
