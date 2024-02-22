package ua.hillel.makarenko.lessons.lesson5.HW4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ім'я першої команди: ");
        String teamName1 = scanner.nextLine();

        System.out.println("Введіть кількість фрагів для 5-ти гравців першої команди:");
        int frags1 = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Гравець " + i + ": ");
            if (scanner.hasNextInt()) {
                frags1 += scanner.nextInt();
            } else {
                System.out.println("Виникла помилка. Перезапустіть, будь ласка, програму.");
                System.exit(0);
            }
       }
        double avgScore1 = frags1 / 5.0;

        scanner.nextLine();
        System.out.print("Введіть ім'я другої команди: ");
        String teamName2 = scanner.nextLine();

        System.out.println("Введіть кількість фрагів для 5-ти гравців другої команди:");
        int frags2 = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Гравець " + i + ": ");
            if (scanner.hasNextInt()) {
                frags2 += scanner.nextInt();
            } else {
                System.out.println("Виникла помилка. Перезапустіть, будь ласка, програму.");
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
            winner = "Нічия";
            isDraw = true;
        }

        System.out.println("Середнє арифметичне балів команди " + teamName1 + ": " + avgScore1);
        System.out.println("Середнє арифметичне балів команди " + teamName2 + ": " + avgScore2);
        if (isDraw) {
            System.out.println("Нічия команди набрали по " + frags1 + " " + "очків." );
        } else {
            System.out.println("Перемогла команда " + winner + ", набравши " + winnerFrags + " " + "очків.");
        }
        scanner.close();
    }
}
