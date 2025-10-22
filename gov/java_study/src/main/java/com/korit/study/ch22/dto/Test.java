package com.korit.study.ch22.dto;

public class Test {
    private String name;

    public void call() {
        Test t = new Test();
        t.name = "김준일";
        System.out.println(t.name);
    }
    public void  thisCall() {
        //객체 생성을 안해서 null이 나오는게 아닐까
        System.out.println(name);

    }

    public static void main(String[] args) {
        Test e = new Test();

    }
}
