package ua.hillel.makarenko.lessons.lesson15.HW15;

public class Main {
    public static void main(String[] args) {
        String[] menu = {"Кава", "Чай", "Лимонад", "Мохіто", "Мінеральна вода", "Кока-кола"};

        int totalDrinksCount = 0;
        double totalPrice = 0;

        for (String choice : menu) {
            switch (choice) {
                case "Кава":
                    Drinks.makeCoffee();
                    break;
                case "Чай":
                    Drinks.makeTea();
                    break;
                case "Лимонад":
                    Drinks.makeLemonade();
                    break;
                case "Мохіто":
                    Drinks.makeMojito();
                    break;
                case "Мінеральна вода":
                    Drinks.makeMineralWater();
                    break;
                case "Кока-кола":
                    Drinks.makeCocaCola();
                    break;
                default:
                    System.out.println("Неправильний вибір.");
            }
        }

        System.out.println("Ви замовили " + Drinks.totalDrinksCount + " напоїв.");
        System.out.println("Загальна сума до сплати: " + Drinks.totalPrice + " грн.");
    }
}
