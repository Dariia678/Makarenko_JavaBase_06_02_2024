package ua.hillel.makarenko.lessons.lesson10.HW10;

public class Main {
    public static void main(String[] args) {
        System.out.println(personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(personInfo("Alice", "Johnson", "Los Angeles", "12312412412"));
        System.out.println(personInfo("John", "Doe", "Chicago", "37742123513"));
    }

    static String personInfo(String firstName, String lastName, String city, String phoneNumber) {
        String info = "Зателефонувати громадянину " + firstName + " " + lastName +
                " із міста " + city + " можна за номером " + phoneNumber;
        return info;
    }
}
