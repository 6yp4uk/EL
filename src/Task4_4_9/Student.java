package Task4_4_9;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Student implements Learner {
    LocalTime current_time = LocalTime.now();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
    @Override
    public void learn() {
        System.out.println("Я учусь. .zZ");
        System.out.println("Я закончил учиться");
        System.out.println("Текущее время: " + current_time.format(format));

    }
}