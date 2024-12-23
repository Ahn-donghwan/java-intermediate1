package com.sparta.javaintermediate1.lang.time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

    public static void main(String[] args) {

        // 생성
        Instant now = Instant.now();  // UTC 기준
        ZonedDateTime zdt = ZonedDateTime.now();
        Instant epochStart = Instant.ofEpochSecond(0);

        // 계산
        Instant later = epochStart.plusSeconds(3600);

        // 조회
        long laterEpochSecond = later.getEpochSecond();
    }
}
