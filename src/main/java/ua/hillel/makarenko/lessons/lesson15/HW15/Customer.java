package ua.hillel.makarenko.lessons.lesson15.HW15;

import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;

        while (true) {
            System.out.println("Choose a drink: ");
            System.out.println("1. Coffee");
            System.out.println("2. Tea");
            System.out.println("3. Lemonade");
            System.out.println("4. Mojito");
            System.out.println("5. Mineral Water");
            System.out.println("6. Coca Cola");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            System.out.println("Enter quantity: ");
            int quantity = scanner.nextInt();

            switch (choice) {
                case 1:
                    totalCost += new Order(quantity, Drinks.COFFEE_PRICE).getTotalPrice();
                    DrinkService.serveDrink(DrinksMachine.COFFEE);
                    break;
                case 2:
                    totalCost += new Order(quantity, Drinks.TEA_PRICE).getTotalPrice();
                    DrinkService.serveDrink(DrinksMachine.TEA);
                    break;
                case 3:
                    totalCost += new Order(quantity, Drinks.LEMONADE_PRICE).getTotalPrice();
                    DrinkService.serveDrink(DrinksMachine.LEMONADE);
                    break;
                case 4:
                    totalCost += new Order(quantity, Drinks.MOJITO_PRICE).getTotalPrice();
                    DrinkService.serveDrink(DrinksMachine.MOJITO);
                    break;
                case 5:
                    totalCost += new Order(quantity, Drinks.MINERAL_WATER_PRICE).getTotalPrice();
                    DrinkService.serveDrink(DrinksMachine.MINERAL_WATER);
                    break;
                case 6:
                    totalCost += new Order(quantity, Drinks.COCA_COLA_PRICE).getTotalPrice();
                    DrinkService.serveDrink(DrinksMachine.COCA_COLA);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        System.out.println("Total cost: $" + totalCost);
    }
}
