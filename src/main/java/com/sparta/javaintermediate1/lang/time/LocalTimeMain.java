package com.sparta.javaintermediate1.lang.time;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {

        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(23, 59, 59);

        // 계산 ( 불변 )
        LocalTime ofTimePlus = ofTime.plusSeconds(30);
    }
}
