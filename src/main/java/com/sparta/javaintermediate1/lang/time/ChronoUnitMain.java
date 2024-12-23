package com.sparta.javaintermediate1.lang.time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {

    public static void main(String[] args) {

        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.println(value);
        }

        // 차이 구하기
        LocalTime lt1 = LocalTime.of(1, 10, 0);
        LocalTime lt2 = LocalTime.of(2, 20, 0);

        long secondsBetween = ChronoUnit.SECONDS.between(lt1, lt2);
        long minutesBetween = ChronoUnit.MINUTES.between(lt1, lt2);
    }
}
