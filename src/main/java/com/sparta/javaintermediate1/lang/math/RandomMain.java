package com.sparta.javaintermediate1.lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {

        Random random1 = new Random();
        Random random2 = new Random(1);   // seed 가 같으면 Random 의 결과가 같다.

        int randomInt = random1.nextInt();
        System.out.println("randomInt: " + randomInt);

        double randomDouble = random1.nextDouble();    // 0.0d ~ 1.0d
        System.out.println("randomDouble: " + randomDouble);

        boolean randomBoolean = random1.nextBoolean();
        System.out.println("randomBoolean: " + randomBoolean);

        // 범위 조회
        int randomRange1 = random1.nextInt(10);   // 0 ~ 9 까지 출력
        System.out.println("0 ~ 9 : " + randomRange1);

        int randomRange2 = random2.nextInt(10) + 1;   // 1 ~ 10 까지 출력
        System.out.println("1 ~ 10 : " + randomRange2);
    }
}
