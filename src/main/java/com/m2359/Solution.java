package com.m2359;

import com.m2359.IAnimal.CanFly;
import com.m2359.IAnimal.CanSing;
import com.m2359.IAnimal.CanSwim;
import com.m2359.IAnimal.CanWalk;
import com.m2359.chicken.Chicken;
import com.m2359.chicken.Rooster;
import com.m2359.fish.Clownfish;
import com.m2359.fish.Dolphin;
import com.m2359.fish.Fish;
import com.m2359.fish.Shark;
import com.m2359.utils.Color;
import com.m2359.utils.Messages;

import java.util.Locale;

public class Solution {

    public static void main(String[] args) {

        // 1
        System.out.println("--- I am a BIRD ---");
        Bird bird = new Bird();
        System.out.println(bird.walk());
        System.out.println(bird.fly());
        System.out.println(bird.sing());
        System.out.println();

        // 2
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

        // 3
        System.out.println("--- I am a ROOSTER ---");
        Rooster rooster = new Rooster();
        System.out.println(rooster.getSound());
        System.out.println();

        // 4
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

        // B1
        System.out.println("-- I am a FISH --");
        Fish fish = new Fish();
        System.out.println(fish.swim());
        System.out.println();

        // B2
        System.out.println("-- I am a SHARK --");
        Shark shark = new Shark("large", Color.GREY);
        System.out.println(shark.getColor().text);
        System.out.println(shark.getSize());
        System.out.println(shark.eat(new Clownfish("medium", Color.ORANGE)));
        System.out.println();

        System.out.println("-- I am a CLOWNFISH --");
        Clownfish clownfish = new Clownfish("small", Color.ORANGE);
        System.out.println(clownfish.getColor().text);
        System.out.println(clownfish.getSize());
        System.out.println(clownfish.makeJokes());
        System.out.println();

        // B3
        System.out.println("-- I am a DOLPHIN --");
        Dolphin dolphin = new Dolphin();
        System.out.println(dolphin.swim());
        System.out.println();

        // D1
        System.out.println("-- I am a BUTTERFLY --");
        AdultButterfly adultButterfly = new AdultButterfly();
        System.out.println(adultButterfly.fly());
        System.out.println(adultButterfly.getSound());
        System.out.println();

        // D2
        System.out.println("-- I am a CATERPILLAR --");
        CaterpillarButterfly caterpillar = new CaterpillarButterfly();
        System.out.println(caterpillar.walk());
        System.out.println();

        // E
        Animal[] animals = new Animal[]{ new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark("gigantic", Color.GREY),
                new Clownfish("tiny", Color.ORANGE),
                new Dolphin(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };

        int countSwim = 0;
        int countFly = 0;
        int countWalk = 0;
        int countSing = 0;

        for (Animal animal : animals) {
            if (animal instanceof CanSwim) {
                countSwim++;
            }
            if (animal instanceof CanFly) {
                countFly++;
            }
            if (animal instanceof CanWalk) {
                countWalk++;
            }
            if (animal instanceof CanSing) {
                countSing++;
            }
        }
        System.out.println("No of animals that can SWIM: " + countSwim);
        System.out.println("No of animals that can FLY: " + countFly);
        System.out.println("No of animals that can WALK: " + countWalk);
        System.out.println("No of animals that can SING: " + countSing);
        System.out.println();

        System.out.println("-- I am a ROOSTER in a foreign land --");
        Messages.setLocale(Locale.SIMPLIFIED_CHINESE);
        System.out.println(rooster.getSound());    }
}
