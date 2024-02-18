package ua.hillel.makarenko.lessons.lesson4.HW2;

public class Main {
    public static void main(String[] args) {

        int warriorAttackLi = 13;
        int archerAttackLi = 24;
        int horsemanAttackLi = 46;

        int warriorAttackMin = 9;
        int archerAttackMin = 35;
        int horsemanAttackMin = 12;

        int warriorsLi = 860;

        int warriorsMin = (int)(warriorsLi * 1.5);

        int totalAttackLi = warriorsLi * (warriorAttackLi + archerAttackLi + horsemanAttackLi);
        int totalAttackMin = warriorsMin * (warriorAttackMin + archerAttackMin + horsemanAttackMin);

        System.out.println("Загальний показник атаки династії Лі: " + totalAttackLi);
        System.out.println("Загальний показник атаки династії Мінь: " + totalAttackMin);

    }
}
