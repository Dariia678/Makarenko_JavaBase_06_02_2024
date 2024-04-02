package ua.hillel.makarenko.lessons.lesson14.interfaces;

public interface Flyible {
    public static final int DISTANCE = 10;

    public abstract void fly();

    default void defaultMethod() {
        System.out.println("its defaultMethod from Flyible");
    }
}
