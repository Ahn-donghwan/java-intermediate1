package com.sparta.javaintermediate1.lang.anonymous.ex;

public class Ex0RefMain {

    public static void hello(String str) {
        System.out.println("Program start");  // 변하지 않는 부분
        // 변하는 부분 시작
        System.out.println("Hello" + str);       // 변하는 부분
        // 변하는 부분 종료
        System.out.println("Program end");    // 변하지 않는 부분
    }

    public static void main(String[] args) {
        hello("Java");
        hello("Spring");
    }

}
