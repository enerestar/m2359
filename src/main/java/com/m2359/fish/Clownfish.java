package com.m2359.fish;

import com.m2359.utils.Color;
import com.m2359.utils.Messages;

import java.util.ArrayList;
import java.util.List;

public class Clownfish extends Fish {

    public Clownfish(String size, Color color) {
        super(size, color);
    }

    public String makeJokes() {
        List<String> jokes = new ArrayList<>();
        jokes.add(Messages.getMessages().joke);
        jokes.add(Messages.getMessages().joke2);
        jokes.add(Messages.getMessages().joke3);
        double threeJokes = Math.random() * 3;
        return jokes.get(Math.toIntExact(Double.valueOf(threeJokes).longValue()));
    }
}
