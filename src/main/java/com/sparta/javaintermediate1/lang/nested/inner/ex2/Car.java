package com.sparta.javaintermediate1.lang.nested.inner.ex2;

public class Car {

    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println(model + "start complete ! ");
    }

    // Car 에서만 사용
    public class Engine {

        public void start() {
            System.out.println("charge level checking : " + chargeLevel);
            System.out.println(model + "engine start");
        }
    }
}
