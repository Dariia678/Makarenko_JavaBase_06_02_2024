package ua.hillel.makarenko.lessons.lesson15;

public enum CarType {
    CAR("Автомобiль", "type2"),
    BUS("Автобус"),
    TRUCK("Вантажiвка"),
    MOTORCYCLE("Мотоцикл");

    private String type;
    private String type2;

    CarType(String type) {
        this.type = type;
    }

    CarType(String type, String type2) {
        this.type = type;
        this.type2 = type2;
    }

    public String getType() {
        return type;
    }

    public String getType2() {
        return type2;
    }
}
