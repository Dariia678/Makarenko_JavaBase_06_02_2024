package ua.hillel.makarenko.lessons.lesson14.interfaces;

public class Airplane implements Flyible {
    @Override
    public void fly() {
        System.out.println("Airplane fly");
    }
}
