package com.sparta.javaintermediate1.lang.time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {

        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2018, 1, 1);

        // 계산 ( 불변 )
        LocalDate plusDays = ofDate.plusDays(10);
    }
}
