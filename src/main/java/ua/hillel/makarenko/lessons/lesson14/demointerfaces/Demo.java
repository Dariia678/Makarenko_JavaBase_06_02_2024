package ua.hillel.makarenko.lessons.lesson14.demointerfaces;

public class Demo implements Interface4 {
    @Override
    public void methodFromInterface4() {
        System.out.println("methodFromInterface4");
    }

    @Override
    public void methodFromInterface3() {
        System.out.println("methodFromInterface3");
    }
}
