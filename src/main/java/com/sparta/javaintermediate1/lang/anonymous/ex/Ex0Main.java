package com.sparta.javaintermediate1.lang.anonymous.ex;

public class Ex0Main {

    public static void helloJava() {
        System.out.println("Program start");  // 변하지 않는 부분
        System.out.println("Hello Java");     // 변하는 부분
        System.out.println("Program end");    // 변하지 않는 부분
    }

    public static void helloSpring() {
        System.out.println("Program start");  // 변하지 않는 부분
        System.out.println("Hello Spring");   // 변하는 부분
        System.out.println("Program end");    // 변하지 않는 부분
    }

    public static void main(String[] args) {
        helloJava();
        helloSpring();
    }
}
