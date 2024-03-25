package ua.hillel.makarenko.lessons.lesson12.car;

import ua.hillel.makarenko.lessons.lesson12.car.Car;

public class ChildCar extends Car {
    public ChildCar(String color, int countWheels) {
        super(color, countWheels);
    }
    void demo() {
        System.out.println(fuelStatus);
        System.out.println(countWheels);
    }
}
