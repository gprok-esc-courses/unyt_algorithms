package oop.no_inheritance;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + " wooof");
    }
}
