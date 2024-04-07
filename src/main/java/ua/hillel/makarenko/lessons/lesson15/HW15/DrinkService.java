package ua.hillel.makarenko.lessons.lesson15.HW15;

public class DrinkService {

    public static void serveDrink(DrinksMachine drink) {
        switch (drink) {
            case COFFEE:
                DrinkMaker.makeCoffee();
                break;
            case TEA:
                DrinkMaker.makeTea();
                break;
            case LEMONADE:
                DrinkMaker.makeLemonade();
                break;
            case MOJITO:
                DrinkMaker.makeMojito();
                break;
            case MINERAL_WATER:
                DrinkMaker.makeMineralWater();
                break;
            case COCA_COLA:
                DrinkMaker.makeCocaCola();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
