package com.sparta.javaintermediate1.lang.time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {

    public static void main(String[] args) {

        // 생성
        Period period = Period.ofDays(10);

        // 계산에 사용
        LocalDate currentDate = LocalDate.of(2030, 1, 1);
        LocalDate plusDate = currentDate.plus(period);

        // 기간 차이
        LocalDate startDate = LocalDate.of(2030, 1, 1);
        LocalDate endDate = LocalDate.of(2030, 4, 2);
        Period between = Period.between(plusDate, startDate);
    }
}
