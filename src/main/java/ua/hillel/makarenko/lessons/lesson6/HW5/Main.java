package ua.hillel.makarenko.lessons.lesson6.HW5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(11);
        int attempts = 3;
        int userGuess;

        System.out.println("����'���� ������� ����� �� 0 �� 10. ��������� ��������!");

        Scanner input = new Scanner(System.in);

        while (attempts > 0) {
            System.out.print("������ ���� ������: ");

            while (true) {
                if (input.hasNextInt()) {
                    userGuess = input.nextInt();
                    break;
                } else {
                    System.out.println("������� �������. ������������, ���� �����, ��������.");
                    input.nextLine();
                    System.exit(0);
                }
            }
            if (userGuess == numberToGuess) {
                System.out.println("³����! �� �������� �����!");
                break;
            } else {
                System.out.println("�����������. ��������� �� ���.");
                attempts--;
            }
        }
        if (attempts == 0) {
            System.out.println("�� ����, �� �� �������� �����. �������� ����� ����: " + numberToGuess);
        }

        input.close();

    }
}