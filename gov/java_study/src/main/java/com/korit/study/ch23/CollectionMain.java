package com.korit.study.ch23;

import java.util.ArrayList;

public class CollectionMain {
    public static void main(String[] args) {
        //대문자 시작 클래스 = 객체 = 안에 메서드 있음
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("20");
        list.add(30.5);
        list.add(true);
        System.out.println(list);
        //object 타입으로 업캐스팅 되어 있는 상태로 나옴
        //System.out.println(list.get(0));
        System.out.println(list.get(0));
        ArrayList<String> strList = new ArrayList<>();
        strList.add("문자열만 가능");
        System.out.println(strList.get(0));

        test(new ArrayList<>());
    }

    public static void test(ArrayList<String> strList) {

    }
}
