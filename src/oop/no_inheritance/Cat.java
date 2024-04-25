package oop.no_inheritance;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + " mieow");
    }
}
