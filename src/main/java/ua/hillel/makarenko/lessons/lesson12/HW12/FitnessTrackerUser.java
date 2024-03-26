package ua.hillel.makarenko.lessons.lesson12.HW12;

public class FitnessTrackerUser {
    private final String name;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private final String email;
    private final String phone;
    private String lastName;
    private int weight;
    private String bloodPressure;
    private int stepsPerDay;
    private final int age;

    public FitnessTrackerUser(String name, int birthDay, int birthMonth, int birthYear, String email, String phone,
                              String lastName, int weight, String bloodPressure, int stepsPerDay) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;
        this.lastName = lastName;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.stepsPerDay = stepsPerDay;
        this.age = 2020 - birthYear;
    }

    public void printAccountInfo() {
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Date of Birth: " + birthDay + "/" + birthMonth + "/" + birthYear);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Steps per Day: " + stepsPerDay);
        System.out.println();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public int getAge() {
        return age;
    }
}

