package ua.hillel.makarenko.lessons.lesson14.interfaces;

public class Bird extends Animal implements Flyible, Eatable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("bird " + name + " fly");
    }


    @Override
    public void eat() {
        System.out.println("bird " + name + " eat");
    }

    @Override
    public void defaultMethod() {
        Flyible.super.defaultMethod();
        Eatable.super.defaultMethod();
        System.out.println("new method version");
    }
}
