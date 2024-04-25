package oop.no_inheritance;

import oop.Cat;
import oop.Dog;

import java.util.ArrayList;

public class AnimalList {
    public static void main(String[] args) {
        ArrayList<Object> animals = new ArrayList<>();
        animals.add(new Dog("Pluto"));
        animals.add(new Cat("Sylvester"));

        for(Object obj : animals) {
            if(obj instanceof Dog) {
                Dog dog = (Dog) obj;
                dog.sound();
            }
            else if (obj instanceof Cat) {
                Cat cat = (Cat) obj;
                cat.sound();
            }
        }
    }
}
