package ua.hillel.makarenko.lessons.lesson8.HW8;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] first = new int[7];
        int[] second = new int[7];
        Random random = new Random();


        for (int i = 0; i < 7; i++) {
            first[i] = random.nextInt(10);
            second[i] = random.nextInt(10);
        }

        Arrays.sort(first);
        Arrays.sort(second);

        int matches = 0;
        for (int i = 0; i < 7; i++) {
            if (first[i] == second[i]) {
                matches++;
            }
        }
        System.out.print("Збіглися ");
        for (int i = 0; i < 7; i++) {
            if (first[i] == second[i]) {
                System.out.print((i + 1) + "й ");
            }
        }
        System.out.println("елементи");
        System.out.println("Припущені числа організатора лотереї: " + Arrays.toString(first));
        System.out.println("Числа, вгадані гравцем: " + Arrays.toString(second));
        System.out.println("Кількість збігів: " + matches);
    }
}
