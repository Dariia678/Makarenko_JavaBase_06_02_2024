package ua.hillel.makarenko.lessons.lesson6.HW5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(11);
        int attempts = 3;
        int userGuess;

        System.out.println("Комп'ютер загадав число від 0 до 10. Спробуйте відгадати!");

        Scanner input = new Scanner(System.in);

        while (attempts > 0) {
            System.out.print("Введіть вашу спробу: ");

            while (true) {
                if (input.hasNextInt()) {
                    userGuess = input.nextInt();
                    break;
                } else {
                    System.out.println("Виникла помилка. Перезапустіть, будь ласка, програму.");
                    input.nextLine();
                    System.exit(0);
                }
            }
            if (userGuess == numberToGuess) {
                System.out.println("Вітаємо! Ви відгадали число!");
                break;
            } else {
                System.out.println("Неправильно. Спробуйте ще раз.");
                attempts--;
            }
        }
        if (attempts == 0) {
            System.out.println("На жаль, ви не відгадали число. Загадане число було: " + numberToGuess);
        }

        input.close();

    }
}