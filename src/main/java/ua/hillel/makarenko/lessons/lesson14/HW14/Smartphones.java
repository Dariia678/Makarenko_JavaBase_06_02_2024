package ua.hillel.makarenko.lessons.lesson14.HW14;

public interface Smartphones {
    void call();
    void sms();
    void internet();
}

interface LinuxOS {
    void runLinuxApps();
}

interface IOS {
    void runiOSApps();
}

class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Calling from Android.");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from Android.");
    }

    @Override
    public void internet() {
        System.out.println("Browsing internet from Android.");
    }

    @Override
    public void runLinuxApps() {
        System.out.println("Running Linux apps on Android.");
    }
}

class iPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("Calling from iPhone.");
    }

    @Override
    public void sms() {
        System.out.println("Sending SMS from iPhone.");
    }

    @Override
    public void internet() {
        System.out.println("Browsing internet from iPhone.");
    }

    @Override
    public void runiOSApps() {
        System.out.println("Running iOS apps on iPhone.");
    }
}

