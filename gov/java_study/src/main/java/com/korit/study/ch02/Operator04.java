package com.korit.study.ch02;

import java.nio.file.Path;
import java.util.concurrent.BlockingDeque;

public class Operator04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        boolean c = a > b;
        boolean d = a < b;
        boolean e = a >= b;
        boolean f = a <= b;
        boolean g = a == b;
        boolean h = a != b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        int n = 20;
        boolean r = n >= 5  && n <=15; // 5 ~ 15 사이면 n의 값이 true;
        System.out.println(r);
        a = 10;
        b = 10;
        System.out.println("a" == "a");
        System.out.println(true == true);
        System.out.println(false == false);
        System.out.println('a' == 'a');

        int 키 = 170;
        int 몸무게 = 65;
        double BMI = 몸무게 / Math.pow(키/100.0,2) ;     //키에서 100을 나눈 결과의 제곱을 몸무게에서 나눈 결과
        boolean 저체중 = BMI < 18.5;     //18.5미만
        boolean 정상 = BMI >= 18.5 && BMI < 25.0 ;      //18.5 - 24.9
        boolean 과체중 = BMI >= 25 && BMI < 30;     //25 - 29.9
        boolean 비만 = BMI >= 30.0;      //30이상

        System.out.println("저체중 : " + 저체중);
        System.out.println("저체중 : " + 정상);
        System.out.println("저체중 : " + 과체중);
        System.out.println("저체중 : " + 비만);
        System.out.println(BMI);
        System.out.println();

//      급여 계산(근로 기준법 총근로시간 주간 40 시간, 나머지는 시간외 근무시간)
        int 기본급 = 2400000;
        int 근무시간 = 52 * 4;
        int 시급 = 기본급 / 160;
        int 시간외 = 12 * 4;
        int 총급여 = (int) (기본급 + (시간외 * (시급 * 1.5))) ; //기본급 + (시간외 수당 * 1.5 배)
        int 세금 = (int) (0.1 * 총급여) ; //총급여의 10%
        int 지급급여 = 총급여 - 세금; // 총급여 - 세금

        System.out.println("시급 :" + 시급);
        System.out.println("시간외 :" + 시간외);
        System.out.println("총급여 :" + 총급여);
        System.out.println("세금 :" + 세금);
        System.out.println("지급급여 :" + 지급급여);



    }
}
