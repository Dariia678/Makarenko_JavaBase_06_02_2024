package ua.hillel.makarenko.lessons.lesson15.HW15;

public class Order {
    private int quantity;
    private double totalPrice;

    public Order(int quantity, double price) {
        this.quantity = quantity;
        this.totalPrice = quantity * price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
