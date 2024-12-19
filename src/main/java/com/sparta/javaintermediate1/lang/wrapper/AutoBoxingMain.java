package com.sparta.javaintermediate1.lang.wrapper;

public class AutoBoxingMain {

    public static void main(String[] args) {

        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);     // 오토 박싱 ( auto-boxing )

        // Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();        // 오토 언박싱 ( auto-unboxing )

        System.out.println("boxedValue: " + boxedValue);
        System.out.println("unboxedValue: " + unboxedValue);
    }
}
