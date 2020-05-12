package com.m2359.fish;

import com.m2359.Animal;
import com.m2359.IAnimal.CanSwim;
import com.m2359.utils.Color;
import com.m2359.utils.Messages;

public class Fish extends Animal implements CanSwim {

    private String size;
    private Color color;

    public Fish() {}
    public Fish(String size, Color color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public String swim() {
        return Messages.getMessages().swim;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
