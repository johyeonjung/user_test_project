package com.korit.study.ch19;

import java.util.Objects;

public class Car2 {
    private String model;
    private String color;

    public Car2(String model, String color) {
        this.model = model;
        this.color = color;
    }

    /*
    equals 메서드로 넘어온 매게변수 o가 Car의 객체 car 이 o가 아니라면 false 반환
    만약 맞다면 car의 모델(this(=car).model)과 넘어온 model을 비교, car의 color와 넘어온 color을 비교해서 and 연산자로 두 개 다 같으면
    트루 반환 하나라도 틀리면 펄스, car이 object에 업캐스팅해야함
    car이어야지만 다운캐스팅 가능해서 !( o instanceof Car car) 넣음
     */
//    @Override
//    public boolean equals(Object o) {
//        if ( !( o instanceof Car)) {
//            return false;
//        }
//        Car car = (Car) o;
//        return Objects.equals(model, car.model) && Objects.equals(color, car.color);
//    }

    @Override
    public boolean equals(Object o) {
        if (o.getClass() != Car2.class) {
            return false;
        }
        Car2 car = (Car2) o;
        return Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}
