package ua.hillel.makarenko.lessons.lesson14.interfaces;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird("Kesha");

        bird.eat();
        bird.fly();
        bird.defaultMethod();

//        Flyible bird2 = new Bird("Kesha2");
//        bird2.fly();
//        Проверка
//        if (bird2 instanceof Bird) {
//            ((Bird) bird2).eat();
//        }
//        Массив
//        Flyible[] flyibles = {
//                new Bird("qwe"),
//                new Airplane()
//        };
//
//        for (Flyible flyible : flyibles) {
//            flyible.fly();
//        }

//        System.out.println(Flyible.DISTANCE);

    }
}
