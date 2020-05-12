package com.m2359.fish;

import com.m2359.utils.Color;

public class Shark extends Fish {

    public Shark(String size, Color color) {
        super(size, color);
    }

    public String eat(Fish fish) {
        return "Sharks eat " + fish.getClass().toString();
    }
}
