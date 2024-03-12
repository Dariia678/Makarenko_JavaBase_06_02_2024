package ua.hillel.makarenko.lessons.lesson9.HW9;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість рядків M: ");
        int M = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                M = scanner.nextInt();
                if (M >= 0 && M <= 10) {
                    break;
                } else {
                    System.out.println("Потрібно вести невід'ємне число.");
                    scanner.nextLine();
                }
            } else {
                System.out.println("Виникла помилка.");
                scanner.nextLine();
            }
        }

        System.out.println("Введіть кількість стовпців N: ");
        int N = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N >= 0 && N <= 10) {
                    break;
                } else {
                    System.out.println("Потрібно вести невід'ємне число.");
                    scanner.nextLine();
                }
            } else {
                System.out.println("Виникла помилка.");
                scanner.nextLine();
            }
        }

        int[][] matrix = new int[M][N];
        int[][] transposedMatrix = new int[N][M];

        Random random = new Random();

        System.out.println("Початкова матриця M x N: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = random.nextInt(100);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("\nТранспонована матриця N x M: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                transposedMatrix[i][j] = matrix[j][i];
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
