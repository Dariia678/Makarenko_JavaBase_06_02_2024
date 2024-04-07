package ua.hillel.makarenko.lessons.lesson15.HW15;

public class Main {
    public static void main(String[] args) {
        // ��������� ������ ����� ��� �����������
        String[] menu = {"����", "���", "�������", "������", "̳�������� ����", "����-����"};

        // ��������� ������ ��� ��������� ������� �� �������� �������
        int totalDrinksCount = 0;
        double totalPrice = 0;

        // ���� ����� �� ���� ������������
        for (String choice : menu) {
            switch (choice) {
                case "����":
                    Drinks.makeCoffee();
                    break;
                case "���":
                    Drinks.makeTea();
                    break;
                case "�������":
                    Drinks.makeLemonade();
                    break;
                case "������":
                    Drinks.makeMojito();
                    break;
                case "̳�������� ����":
                    Drinks.makeMineralWater();
                    break;
                case "����-����":
                    Drinks.makeCocaCola();
                    break;
                default:
                    System.out.println("������������ ����.");
            }
        }

        // ��������� �������� ������� �� ���� �� ������
        System.out.println("�� �������� " + Drinks.totalDrinksCount + " �����.");
        System.out.println("�������� ���� �� ������: " + Drinks.totalPrice + " ���.");
    }
}
