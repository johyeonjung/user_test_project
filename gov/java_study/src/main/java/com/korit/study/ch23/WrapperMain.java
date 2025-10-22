package com.korit.study.ch23;

import java.util.Arrays;

public class WrapperMain {
    public static void main(String[] args) {
        int num = 10;
        Integer num2 = num; //autoBoxing
        int num4 = num2;
        //모든 참조자료형은 object의 상속을 받는다
        //boxing : 일반 자료형 -> 참조자료형
        //래핑 : 객체화
        String numStr = num2.toString();
        String numStr2 = Integer.toString(num);
        String numStr3 = "" + num;
        String gnumStr3 = num2.toString();


        double dnum = 0.1;
        Double dnum2 = dnum;
        float fnum = 0.1f;
        Float fnum2 = fnum;





    }
}
