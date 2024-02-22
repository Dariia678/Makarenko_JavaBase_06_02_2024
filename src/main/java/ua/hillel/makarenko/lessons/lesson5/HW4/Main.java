package ua.hillel.makarenko.lessons.lesson5.HW4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("������ ��'� ����� �������: ");
        String teamName1 = scanner.nextLine();

        System.out.println("������ ������� ����� ��� 5-�� ������� ����� �������:");
        int frags1 = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("������� " + i + ": ");
            if (scanner.hasNextInt()) {
                frags1 += scanner.nextInt();
            } else {
                System.out.println("������� �������. ������������, ���� �����, ��������.");
                System.exit(0);
            }
       }
        double avgScore1 = frags1 / 5.0;

        scanner.nextLine();
        System.out.print("������ ��'� ����� �������: ");
        String teamName2 = scanner.nextLine();

        System.out.println("������ ������� ����� ��� 5-�� ������� ����� �������:");
        int frags2 = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("������� " + i + ": ");
            if (scanner.hasNextInt()) {
                frags2 += scanner.nextInt();
            } else {
                System.out.println("������� �������. ������������, ���� �����, ��������.");
                System.exit(0);
            }
        }
        double avgScore2 = frags2 / 5.0;

        boolean isDraw = false;

        String winner;
        int winnerFrags = 0;
        if (avgScore1 > avgScore2) {
            winner = teamName1;
            winnerFrags = frags1;
        } else if (avgScore2 > avgScore1) {
            winner = teamName2;
            winnerFrags = frags2;
        } else {
            winner = "ͳ���";
            isDraw = true;
        }

        System.out.println("������ ����������� ���� ������� " + teamName1 + ": " + avgScore1);
        System.out.println("������ ����������� ���� ������� " + teamName2 + ": " + avgScore2);
        if (isDraw) {
            System.out.println("ͳ��� ������� ������� �� " + frags1 + " " + "����." );
        } else {
            System.out.println("��������� ������� " + winner + ", �������� " + winnerFrags + " " + "����.");
        }
        scanner.close();
    }
}
