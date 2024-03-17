package ua.hillel.makarenko.lessons.lesson11;

public class Person {

    String name;
    int age;

    Person(String name) {
        this.name = name;
    }

    Person(int age) {
        this.age = age;
    }

    Person(String name, int age) {
        int x = 5;
        age += 5;

        this.name = name;
        this.age = age + x;

        run();
        swim();
    }

    void run() {
        System.out.println(name + " run!");
    }
    void swim() {
        System.out.println(name + " swim!");
    }
    String getName() {
        return name;
    }
    void increaseAge() {
        age++;
    }
    void demo() {
        int age = 11;
        System.out.println(this.age);
    }
    void  demo2() {
        System.out.println(age);
    }

    String getInfo() {
        return "name=" + name + ", age=" + age;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", age=" + age;
    }
}
