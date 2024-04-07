package ua.hillel.makarenko.lessons.lesson15.HW15;

public enum DrinksMachine {
    КАВА, ЧАЙ, ЛИМОНАД, МОХІТО, МИНЕРАЛКА, КОКА_КОЛА
}
class Drinks {
    // константи для цін
    static final double COFFEE_PRICE = 2.90;
    static final double TEA_PRICE = 2.0;
    static final double LEMONADE_PRICE = 4.0;
    static final double MOJITO_PRICE = 3.9;
    static final double MINERAL_WATER_PRICE = 1.4;
    static final double COCA_COLA_PRICE = 1.7;

    static int totalDrinksCount = 0;
    static double totalPrice = 0;

    // методи для приготування кожного напою
    static void makeCoffee() {
        System.out.println("Кава готова.");
        totalDrinksCount++;
        totalPrice += COFFEE_PRICE;
    }

    static void makeTea() {
        System.out.println("Чай готовий.");
        totalDrinksCount++;
        totalPrice += TEA_PRICE;
    }

    static void makeLemonade() {
        System.out.println("Лимонад готовий.");
        totalDrinksCount++;
        totalPrice += LEMONADE_PRICE;
    }

    static void makeMojito() {
        System.out.println("Мохіто готовий.");
        totalDrinksCount++;
        totalPrice += MOJITO_PRICE;
    }

    static void makeMineralWater() {
        System.out.println("Мінеральна вода готова.");
        totalDrinksCount++;
        totalPrice += MINERAL_WATER_PRICE;
    }

    static void makeCocaCola() {
        System.out.println("Кока-кола готова.");
        totalDrinksCount++;
        totalPrice += COCA_COLA_PRICE;
    }
}

