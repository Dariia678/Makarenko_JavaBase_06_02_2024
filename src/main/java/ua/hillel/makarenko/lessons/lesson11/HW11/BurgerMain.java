package ua.hillel.makarenko.lessons.lesson11.HW11;

public class BurgerMain {
    public static void main(String[] args) {
        Burger ordinaryBurger = new Burger("пшенична", "яловичина", "чеддер", "томати", "майонез");
        Burger dietBurger = new Burger("цільнозернова", "курятина", "моцарела", "салат");
        Burger doubleMeatBurger = new Burger("булочка з насінням", "свинина", "гауда", "огірки", "кетчуп", "індичатина");
    }
}
