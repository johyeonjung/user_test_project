package com.korit.study.gpt.ex1;

public class Cat implements Animal{
    @Override
    public void sound() {
        System.out.println("야옹");
    }
    @Override
    public void move() {
        System.out.println("고양이가 걷는다");
    }
}
