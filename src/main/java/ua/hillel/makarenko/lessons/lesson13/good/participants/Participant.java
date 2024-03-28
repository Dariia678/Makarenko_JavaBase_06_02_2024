package ua.hillel.makarenko.lessons.lesson13.good.participants;

public abstract class Participant {
    private String name;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
