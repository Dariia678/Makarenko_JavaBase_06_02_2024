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
        System.out.println("Звичайний бургер: булочка - " + bun + ", м'ясо - " + meat + ", сир - " + cheese + ", зелень - " + veggies + ", майонез - " + mayo);
    }

    public Burger(String bun, String meat, String cheese, String veggies) {
        this(bun, meat, cheese, veggies, "немає");
        System.out.println("Дієтичний бургер: булочка - " + bun + ", м'ясо - " + meat + ", сир - " + cheese + ", зелень - " + veggies);
    }

    public Burger(String bun, String meat, String cheese, String veggies, String mayo, String extraMeat) {
        this(bun, meat + " та " + extraMeat, cheese, veggies, mayo);
        System.out.println("Бургер з подвійним м'ясом: булочка - " + bun + ", м'ясо - " + meat + " та " + extraMeat + ", сир - " + cheese + ", зелень - " + veggies + ", майонез - " + mayo);
    }
}

