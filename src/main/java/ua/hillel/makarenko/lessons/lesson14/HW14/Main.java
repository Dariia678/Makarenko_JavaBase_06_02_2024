package ua.hillel.makarenko.lessons.lesson14.HW14;

public class Main {
    public static void main(String[] args) {
        Androids android = new Androids();
        android.call();
        android.sms();
        android.internet();
        android.runLinuxApps();


        iPhones iPhone = new iPhones();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.runiOSApps();
    }
}
