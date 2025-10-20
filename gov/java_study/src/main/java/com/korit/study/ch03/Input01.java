package com.korit.study.ch03;

import java.io.InputStream;
import java.util.Scanner;

public class Input01 {
    public static void main(String[] args) {
//        in은 상수 (final)
        InputStream inputStream = System.in;
//        s를 '선언'함
        Scanner s = new Scanner(inputStream);
        String str = s.next();

        System.out.println("입력값 : " + str);

        String addr =  s.nextLine();
        System.out.println("주소 : " + addr);

    }
}
