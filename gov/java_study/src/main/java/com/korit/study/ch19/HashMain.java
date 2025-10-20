package com.korit.study.ch19;

import java.util.Objects;

public class HashMain {
    // hash(해시)란 key와 value의 한 쌍을 통해 데이터를 표현하는 기법
    // 키 : 중복 불가능 주민번호
    // 밸류 : 중복 가능 이름
    static void main(String[] args) {
        String name1 = "김준일";
        String name2 = new String("김준일");
        int age1 = 30;
        int age2 = 40;

        int hashKey1 = Objects.hash(name1);
        int hashKey2 = Objects.hash(name2);
        int hashKey3 = Objects.hash(age1);
        int hashKey4 = Objects.hash(age2);

        System.out.println(hashKey1);
        System.out.println(hashKey2);
        System.out.println(hashKey3);
        System.out.println(hashKey4);
    }
}
