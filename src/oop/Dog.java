package oop;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void sound() {
        System.out.println(name + " says wooof");
    }
}
