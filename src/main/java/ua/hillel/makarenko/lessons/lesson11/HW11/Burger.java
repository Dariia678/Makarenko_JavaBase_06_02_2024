package ua.hillel.makarenko.lessons.lesson11.HW11;

public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String veggies;
    private String mayo;

    public Burger(String bun, String meat, String cheese, String veggies, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
        this.mayo = mayo;
        System.out.println("��������� ������: ������� - " + bun + ", �'��� - " + meat + ", ��� - " + cheese + ", ������ - " + veggies + ", ������� - " + mayo);
    }

    public Burger(String bun, String meat, String cheese, String veggies) {
        this(bun, meat, cheese, veggies, "����");
        System.out.println("ĳ������� ������: ������� - " + bun + ", �'��� - " + meat + ", ��� - " + cheese + ", ������ - " + veggies);
    }

    public Burger(String bun, String meat, String cheese, String veggies, String mayo, String extraMeat) {
        this(bun, meat + " �� " + extraMeat, cheese, veggies, mayo);
        System.out.println("������ � �������� �'����: ������� - " + bun + ", �'��� - " + meat + " �� " + extraMeat + ", ��� - " + cheese + ", ������ - " + veggies + ", ������� - " + mayo);
    }
}

