package ua.hillel.makarenko.lessons.lesson14.demointerfaces;

public interface Interface1 {
    default void demoMethod() {
        System.out.println("from Interface1");
    }
}
