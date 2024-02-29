package ua.hillel.makarenko.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Пример:
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello World");
//        }
//        Пример:
//        for (int i = 5; i > 0; --i) {
//              System.out.println("Hi!");
//        }
//        Пример:
//        int i = 0;
//
//        for ( ; i < 10; i++) {
//            System.out.println("Hello World");
//            System.out.println(i);
//        }
//        Пример:
//        for (int i = 0; i < 5; ) {
//            System.out.println("Hello Word");
//            System.out.println(i);
//            i++;
//        }
//        Пример:
//        int i = 0;
//        for ( ; ; ) {
//            System.out.println("Hello Word");
//            if (i >= 5) {
//                break;
//            }
//            i++;
//        }
//        Пример:
//        for (int i = 0; i < 10; i++) {
//
//            if (i == 1 || i == 2) {
//                continue;
//            }
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//            if (i == 7) {
//                break;
//            }
//        }
//        Пример:
//        for (int i = 0, j = 10; i < 10 && j > 5; i++, j--) {
//            System.out.println("i = " + i);
//            System.out.println("j = " + j);
//        }
//        for (int i = 0; i < 3; i++) {
//            System.out.println("start first loop");
//            System.out.println("first loop i = " + i);
//            for (int j = 0; j < 2; j++) {
//                System.out.println("second loop");
//                System.out.println("i = " + i);
//                System.out.println("j = " + j);
//            }
//            System.out.println("end first loop");
//        }
//        Пример:
//        int counter = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                for (int k = 0; k < 2; k++) {
//                    for (int l = 0; l < 3; l++) {
//                        counter++;
//                    }
//                }
//            }
//        }
//        System.out.println("counter = " + counter);
//        Пример:
//        виведення лише парних за допомогою циклу FOR
//        0 2 4 6 8 10 12 14 16 18 20
//        for (int i = 0; i < 22; i += 2) {
//            System.out.println(i);
//        }
//        Пример:
//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//        Пример: (Фибоначі)
//        Виведіть на екран перші 11 членів послідовності Фібоначчі
//        1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
//        int num1 = 1;
//        int num2 = 1;
//        int sum = 0;
//
//        System.out.print(num1 + " " + num2 + " ");
//
//        for (int i = 0; i < 9; i++) {
//            sum = num1 + num2;
//            System.out.print(sum + " ");
//            num1 = num2;
//            num2 = sum;
//        }
//        Пример:
//        int i = 0;
//        while (i < 5) {
//            System.out.println("Hello Word");
//            i++;
//        }
//        Пример:
//        a. Зробіть бомбу зі зворотним відліком від 10 до 0 за допомогою циклу WHILE
//        b. додайте до вашої бомби умову, якщо бомба розмінована, вона не вибухне (85 - 100) - win
//        int i = 10;
//        do {
//            System.out.println("Hello Word");
//        } while (i < 5);
//        Пример:
//        int i = 0;
//        while (true) {
//            System.out.println(i);
//            if (i >= 5) {
//                break;
//            }
//            i++;
//        }
//        Пример:
//        Scanner scanner = new Scanner(System.in);
//        int unserValue = 0;
//        while (true) {
//            System.out.println("Please enter integer");
//            if (scanner.hasNextInt()) {
//                unserValue = scanner.nextInt();
//                if (unserValue >= 10 && unserValue <= 20) {
//                    break;
//                } else {
//                    System.out.println("Fron 10 to 20");
//                    scanner.nextLine();
//                }
//            } else {
//                System.out.println("Wrong data, try again!");
//                scanner.nextLine();
//            }
//        }
//        System.out.println("unser value = " + unserValue);
//        Пример:
//        int integer = 10;
//
//        while (true) {
//            System.out.println(integer);
//            int random = (int) (Math.random() * 101);
//            if (random >= 85 && random <= 100) {
//                System.out.println("Win!");
//                break;
//            }
//            integer -= 1;
//            if (integer == -1) {
//                System.out.println("Boom!");
//                break;
//            }
//        }
    }
}
