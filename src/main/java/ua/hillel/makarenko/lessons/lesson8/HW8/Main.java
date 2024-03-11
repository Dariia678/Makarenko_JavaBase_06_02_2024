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
        System.out.print("������� ");
        for (int i = 0; i < 7; i++) {
            if (first[i] == second[i]) {
                System.out.print((i + 1) + "� ");
            }
        }
        System.out.println("��������");
        System.out.println("�������� ����� ����������� ������: " + Arrays.toString(first));
        System.out.println("�����, ������ �������: " + Arrays.toString(second));
        System.out.println("ʳ������ ����: " + matches);
    }
}
