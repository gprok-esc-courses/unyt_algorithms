package oop;

import java.util.ArrayList;

public class AnimalList {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Pluto"));
        animals.add(new Cat("Sylvester"));
        animals.add(new Duck("Donald"));

        for(Animal animal : animals) {
            animal.sound();
        }
    }
}
