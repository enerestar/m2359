package com.m2359;

public class Solution {

    public static void main(String[] args) {

        // 1
        System.out.println("--- I am a BIRD ---");
        Bird bird = new Bird();
        System.out.println(bird.walk());
        System.out.println(bird.fly());
        System.out.println(bird.sing());
        System.out.println();

        System.out.println("--- I am a CHICKEN ---");
        Chicken chicken = new Chicken();
        System.out.println(chicken.getSound());
        System.out.println(chicken.walk());
        System.out.println();

        System.out.println("--- I am a DUCK ---");
        Duck duck = new Duck();
        System.out.println(duck.getSound());
        System.out.println(duck.swim());
        System.out.println();

        System.out.println("--- I am a ROOSTER ---");
        Rooster rooster = new Rooster();
        System.out.println(rooster.getSound());
        System.out.println();

        System.out.println("-- I am a PARROT living near a DOG --");
        Parrot parrotDog= new Parrot(new Dog());
        System.out.println(parrotDog.getSound());
        System.out.println();

        System.out.println("-- I am a PARROT living near a ROOSTER --");
        Parrot parrotRooster= new Parrot(new Rooster());
        System.out.println(parrotRooster.getSound());
        System.out.println();

        System.out.println("-- I am a PARROT living near a CAT --");
        Parrot parrotCat = new Parrot(new Cat());
        System.out.println(parrotCat.getSound());
        System.out.println();

        System.out.println("-- I am a FISH --");
        Fish fish = new Fish();
        System.out.println();
    }
}
