package com.sparta.javaintermediate1.lang.nested.inner.ex1;

// Car 에서만 사용
public class Engine {

    private Car car;

    public Engine(Car car) {
        this.car = car;
    }

    public void start() {
        System.out.println("charge level checking : " + car.getChargeLevel());
        System.out.println(car.getModel() + "engine start");
    }
}
