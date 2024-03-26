package ua.hillel.makarenko.lessons.lesson12.HW12;

public class Main {
    public static void main(String[] args) {
        FitnessTrackerUser user1 = new FitnessTrackerUser("Bill", 21, 5, 1995, "bill@example.com", "89854975894",
                "Doe", 75, "120/80", 8000);

        FitnessTrackerUser user2 = new FitnessTrackerUser("Anna", 4, 9, 1978, "anna@example.com", "578493988893",
                "Smith", 65, "110/70", 10000);

        FitnessTrackerUser user3 = new FitnessTrackerUser("Sofia", 15, 12, 2000, "sofia@example.com", "467389478393",
                "Johnson", 80, "130/90", 6000);

        // Print initial user info
        System.out.println("Initial User Info:");
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();

        // Update information for user1 and user2
        user1.setLastName("Doe Jr.");
        user1.setWeight(78);
        user1.setBloodPressure("125/85");
        user1.setStepsPerDay(9000);

        user2.setLastName("Smithson");
        user2.setWeight(70);
        user2.setBloodPressure("115/75");
        user2.setStepsPerDay(12000);

        // Print updated user info
        System.out.println("Updated User Info:");
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
    }
}
