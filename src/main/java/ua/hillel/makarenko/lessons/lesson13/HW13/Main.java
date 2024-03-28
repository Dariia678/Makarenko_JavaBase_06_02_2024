package ua.hillel.makarenko.lessons.lesson13.HW13;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] bands = {new PopMusic(), new RockMusic(), new ClassicMusic()};

        for (MusicStyles band : bands) {
            band.playMusic();
        }
    }
}
