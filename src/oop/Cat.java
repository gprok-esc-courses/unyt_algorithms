package oop;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void sound() {
        System.out.println(name +  " says mieow");
    }
}
