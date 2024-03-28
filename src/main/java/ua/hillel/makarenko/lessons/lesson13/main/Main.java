package ua.hillel.makarenko.lessons.lesson13.main;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Myrzik", 10);

        cat.run();
        cat.swim();

        cat.demoFinalArgument(55);

        cat.demoFinalMethod();
        cat.demoFinalMethod();
        cat.demoFinalMethod();
        cat.demoFinalMethod();
        cat.demoFinalMethod();
        cat.demoFinalMethod();
        cat.demoFinalMethod();
        cat.demoFinalMethod();
        cat.demoFinalMethod();
        cat.demoFinalMethod();
        cat.demoFinalMethod();

        cat.swim();

        System.out.println(Cat.counter);

        new Cat("qwqwe", 5);

        System.out.println(Cat.counter);

        Cat.demoStaticMethod();
    }
}
