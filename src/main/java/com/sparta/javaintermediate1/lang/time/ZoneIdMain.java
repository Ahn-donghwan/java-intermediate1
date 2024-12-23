package com.sparta.javaintermediate1.lang.time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {

    public static void main(String[] args) {

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String availableZoneId : availableZoneIds) {
            System.out.println("Available Zone Id: " + availableZoneId);
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault() | " + zoneId);

        ZoneId seoulZonId = ZoneId.of("Asia/Seoul");
        System.out.println("SeoulZonId.systemDefault() | " + seoulZonId);
    }
}
