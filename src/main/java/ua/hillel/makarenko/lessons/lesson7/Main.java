package ua.hillel.makarenko.lessons.lesson7;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        ������:
//        int[] array = new int[5];
//
//        array[0] = 5;
//        array[1] = 2;
//        array[2] = 3;
//
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        ������:
//        int[] array = new int[5];
//
//        for (int i = 0; i < 5; i++) {
//            array[i] = (i + 1);
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(array[i]);
//        }
//        ������:
//        String[] arrayStrings = new String[2];
//
//        arrayStrings[0] = "Team1";
//        arrayStrings[1] = "team2";
//
//        for (int i = 0; i < 2; i++) {
//            System.out.println(arrayStrings[i]);
//
//        }
//        ������:
//        int[] array = new int[5];
//        String[] arrayStrings = new String[2];
//
//        System.out.println(Arrays.toString(array));
//
//        for (int i = 0; i < 5; i++) {
//            array[i] = (i + 1);
//        }
//        System.out.println(Arrays.toString(array));
//        ������:
//        int[] array = new int[5];
//        String[] arrayStrings = new String[2];
//
//        for (int i = 0; i < 5; i++) {
//            array[i] = (i + 10);
//        }
//
//        System.out.println("array length = " + array.length);
//        System.out.println("last value = " + array[array.length - 1]);
//        ������:
//        int[] array = new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 101);
//        }
//        System.out.println(Arrays.toString(array));
//        ������:
//        int[] array = {1, 2, 3, 4, 5};
//        int[] array2 = new int[]{1, 2, 3, 4, 5};
//
//        System.out.println(Arrays.toString(array));
//
//        for (int value : array) {
//            System.out.println(value);
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 3) {
//                array[i] = 77;
//            }
//
//        }
//        System.out.println(Arrays.toString(array));
//        ������:
//        int[] array = new int[5];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 101);
//
//            System.out.println(array[i]);
//        }
//        ������:
//        �������� ����� �� 10 �������� �� ��������� ���� ����������� ������� �� 0 �� 10
//        ������� �� ����� � ���� ����� �� �����, ��������� �� �����, ��� �
//        ���������� ������� �� �������� ����
//        int[] array = new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//            int randomNumber = (int) (Math.random() * 11);
//            array[i] = randomNumber;
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (i == array.length - 1) {
//                System.out.print(array[i]);
//            } else {
//                System.out.print(array[i] + ", ");
//            }
//        }
//        ������:
//        � ������� ������ � 10 �����������. ��� ������� ������������
//        ����������� ��������� ����, �� �� ��� �������. �� �� ���������
//        ������� �� ����� �����. �������� �������, ��� � ���������
//        ����� ������������, ����� ����� ��'������.
//        int[] people = {11, 44, 98, 44, 22, 33, 55, 22, 90, 9};
//
//        int maxValue = people[0];
//        int indexMaxValue = 0;
//
//        for (int value : people) {
//            if (value > maxValue) {
//                maxValue = value;
//            }
//        }
//        System.out.println("max value = " + maxValue);
//
//        for (int i = 0; i < people.length; i++) {
//            if (people[i] > maxValue) {
//                maxValue = people[i];
//                indexMaxValue = i;
//            }
//
//        }
//        System.out.println("max value = " + maxValue + ", index = " + indexMaxValue);
//        ������:
//        � ����� ������������ ������ 10 �����. ���� ������� ���������
//        ������ ������� � ���� ������ ������, � �������� ������� - �
//        ������. �������� �������, ��� ������ �������� ����� ����
//        ������� �������� ����� ���� �������� �������.
//        int[] team = new int[10];
//
//        for (int i = 0; i < team.length; i++) {
//            team[i] = (int) (Math.random() * 11);
//        }
//        System.out.println(Arrays.toString(team));
//
//        int teamOne = 0;
//        int teamTwo = 0;
//
//        for (int i = 0; i < team.length; i++) {
//            if (i % 2 == 0) {
//                teamOne += team[i];
//            } else {
//                teamTwo += team[i];
//            }
//        }
//        System.out.println("sum team one = " + teamOne);
//        System.out.println("sum team two = " + teamTwo);
//
//        if (teamOne > teamTwo) {
//            System.out.println("team one WIN!");
//        } else if (teamOne < teamTwo) {
//            System.out.println("team two WIN!");
//        } else {
//            System.out.println("Draw!");
//        }
    }
}
