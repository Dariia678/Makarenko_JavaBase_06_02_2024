package ua.hillel.makarenko.lessons.lesson14.demointerfaces;

public interface Interface4 extends Interface1, Interface2, Interface3 {
    void methodFromInterface4();

    @Override
    default void demoMethod() {
        Interface1.super.demoMethod();
        Interface2.super.demoMethod();

        System.out.println("from Interface4");
    }
}
