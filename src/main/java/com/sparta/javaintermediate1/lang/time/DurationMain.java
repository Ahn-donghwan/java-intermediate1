package com.sparta.javaintermediate1.lang.time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {

    public static void main(String[] args) {

        // 생성
        Duration duration = Duration.ofMinutes(30);
        LocalTime lt = LocalTime.of(1,0);

        // 계산에 사용
        LocalTime plusTime = lt.plus(duration);

        // 시간 차이
        LocalTime start = LocalTime.of(9,0);
        LocalTime end = LocalTime.of(10,0);
        Duration between = Duration.between(start, end);
    }
}
