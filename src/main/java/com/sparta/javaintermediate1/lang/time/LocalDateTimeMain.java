package com.sparta.javaintermediate1.lang.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {

        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);

        // 날짜와 시간을 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();

        // 날짜와 시간을 함께
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        // 계산 ( 불변 )
        LocalDateTime ofDtPlus = ofDt.plusDays(100);
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);

        // 비교
        nowDt.isBefore(ofDt);
        nowDt.isAfter(ofDt);
        nowDt.isAfter(ofDtPlus);
    }
}
