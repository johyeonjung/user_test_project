package com.korit.study.ch02;

public class Operator03 {
    public static void main(String[] args) {
//      논리연산자
//      || or 연산자 (합)
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = b1 || b2;
        System.out.println(b3);
        b3 = b1 || true;
        System.out.println(b3);


//      && and 연산자 (곱)
        boolean b4 = b1 && b2;
        b4 = b1 && true;
        b4 = true && true;

//      ! not 연산자 (부정)
        boolean b5 = b1 && true;
        b5 = !b5;
        System.out.println(!true && true);
        System.out.println(!(true && true));
    }
}
