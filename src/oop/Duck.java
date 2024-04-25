package oop;

public class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " says quack");
    }
}
