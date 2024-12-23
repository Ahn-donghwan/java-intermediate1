package com.sparta.javaintermediate1.lang.time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {

    public static void main(String[] args) {

        OffsetDateTime nowOdt = OffsetDateTime.now();
        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00"));

    }
}
