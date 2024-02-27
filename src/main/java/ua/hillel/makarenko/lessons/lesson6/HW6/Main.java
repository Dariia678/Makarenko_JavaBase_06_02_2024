package ua.hillel.makarenko.lessons.lesson6.HW6;

public class Main {
    public static void main(String[] args) {
        generateSpaceshipNumbers();
    }

    public static void generateSpaceshipNumbers() {
        int count = 0;
        int number = 1;
        while (count < 100) {
            if (!containsUnluckyNumbers(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    public static boolean containsUnluckyNumbers(int number) {
        String numberString = Integer.toString(number);
        return numberString.contains("4") || numberString.contains("9");
    }
}
