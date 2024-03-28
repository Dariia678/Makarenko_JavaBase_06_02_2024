package ua.hillel.makarenko.lessons.lesson13.good.participants;

import ua.hillel.makarenko.lessons.lesson13.good.obstacle.Obstacle;
import ua.hillel.makarenko.lessons.lesson13.good.obstacle.ObstaclePoll;
import ua.hillel.makarenko.lessons.lesson13.good.obstacle.ObstacleWall;

public class Main {
    public static void main(String[] args) {
//        ObstacleWall obstacleWall = new ObstacleWall();
//        ObstaclePoll obstaclePoll = new ObstaclePoll();

//        ParticipantCat participantCat = new ParticipantCat("Cat1");
//        ParticipantDog participantDog = new ParticipantDog("Dog1");
//        ParticipantFrog participantFrog = new ParticipantFrog("Frog1");

//        obstacleWall.start(participantCat);
//        obstacleWall.start(participantDog);
//        obstacleWall.start(participantFrog);

//        obstaclePoll.start(participantCat);
//        obstaclePoll.start(participantDog);
//        obstaclePoll.start(participantFrog);

//        Массивы
        Obstacle[] obstacles = {
                new ObstacleWall(),
                new ObstaclePoll()
        };

        Participant[] participants = {
                new ParticipantCat("Cat1"),
                new ParticipantCat("Cat2"),
                new ParticipantCat("Cat3"),
                new ParticipantCat("Cat4"),
                new ParticipantDog("Dog1")
        };
//        Берем всех участников
        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                obstacle.start(participant);
            }
        }

    }
}
