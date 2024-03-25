package ua.hillel.makarenko.lessons.lesson12.HW12;

public class FitnessTrackerUser {
    private String name;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String email;
    private String phone;

    private String surname;
    private int weight;
    private int bloodPressure;
    private int stepsPerDay;
    private int age;

    public FitnessTrackerUser(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, String email, String phone) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.age = 2024 - yearOfBirth;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public void printAccountInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Date of Birth: " + dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Steps per day: " + stepsPerDay);
        System.out.println();
    }

    public static void main(String[] args) {
        FitnessTrackerUser user1 = new FitnessTrackerUser("Bill", 2, 5, 1978, "bill@example.com", "689877567");
        user1.setSurname("Doe");
        user1.setWeight(75);
        user1.setBloodPressure(120);
        user1.setStepsPerDay(10000);

        FitnessTrackerUser user2 = new FitnessTrackerUser("Maria", 23, 8, 1995, "maria@example.com", "234567877");
        user2.setSurname("Smith");
        user2.setWeight(60);
        user2.setStepsPerDay(8000);

        FitnessTrackerUser user3 = new FitnessTrackerUser("Mon", 15, 10, 2003, "mon@example.com", "2345657687");

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
    }
}
