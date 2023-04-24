package com.sg.coding.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimeDurationExample {
    public static void main(String[] args) {
        LocalTime localTime=LocalTime.of(7,10);
        LocalTime localTime1=LocalTime.of(8,10);
        long minutesDiff=localTime.until(localTime1, ChronoUnit.MINUTES);
        System.out.println("until Minutes Diff : " + minutesDiff);

        Duration duration = Duration.between(localTime,localTime1);
        System.out.println("duration  : " +  duration.toMinutes());


        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2018,8,13,23,59);

        Duration duration3 = Duration.between(localDateTime,localDateTime1);

        System.out.println("duration3.toDays(): "+duration3.toDays());





    }
}
