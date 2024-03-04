package ua.hillel.makarenko.lessons.lesson7.HW7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int teamSize = 25;
        int minAge = 18;
        int maxAge = 40;

        int[] team1Ages = generateRandomAges(teamSize, minAge, maxAge);
        int[] team2Ages = generateRandomAges(teamSize, minAge, maxAge);

        System.out.println("Вік гравців першої команди:");
        printAges(team1Ages);
        double team1AverageAge = calculateAverageAge(team1Ages);
        System.out.println("Середній вік гравців першої команди: " + team1AverageAge);

        System.out.println("\nВік гравців другої команди:");
        printAges(team2Ages);
        double team2AverageAge = calculateAverageAge(team2Ages);
        System.out.println("Середній вік гравців другої команди: " + team2AverageAge);
    }

    public static int[] generateRandomAges(int size, int min, int max) {
        Random random = new Random();
        int[] ages = new int[size];
        for (int i = 0; i < size; i++) {
            ages[i] = random.nextInt(max - min + 1) + min;
        }
        return ages;
    }

    public static void printAges(int[] ages) {
        for (int age : ages) {
            System.out.print(age + " ");
        }
        System.out.println();
    }

    public static double calculateAverageAge(int[] ages) {
        double sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return sum / ages.length;
    }
}
