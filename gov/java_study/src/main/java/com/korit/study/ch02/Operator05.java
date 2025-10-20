package com.korit.study.ch02;

public class Operator05 {
    public static void main(String[] args) {
        String r = 10 > 0 ? "ㅇㅇ" : "ㄴㄴ";
        double r2 = 10 > 0 ? 1.1 : 2.2;
        char r3 = 10 > 0 ? 'o' : 'x';
        String r4 = -10 > 0 ? "큼" : -10 > -20 ? "마이너스 이십보다 커" : "작아";
        String r5 = 2002 % 100 == 0 ? "100의 배수" : "100의 배수가 아니다";


        int year = 1999;    //2024년, 2000년 윤년
        //윤년을 확인하세요 4의 배수이면서 100의 배수가 아니거나, 또는 400의 배수

        String result = year % 4 == 0 && year % 100 != 0 ? "윤년입니다" : year % 400 == 0 ? "윤년입니다" : "평년입니다";
        System.out.println(result);


        int 현재잔액 = 150000;
        int 출금금액 = 160000;   //수수료 1000원 포함
        boolean 출금불가능 = 현재잔액 - (출금금액 +1000) < 0;

        String 상태 = 출금불가능 ? "실패" : "성공" ; //성공, 실패
        int 출금액 = 출금불가능 ? 0: 출금금액 + 1000;
        int 거래후잔액 = 출금불가능 ? 현재잔액 : 현재잔액 - (출금금액 + 1000);

        System.out.println("거래 상태 : " + 상태);
        System.out.println("출금액 : " + 출금액 + "원 (수수료 1000원 포함)");
        System.out.println("거래후잔액 : " + 거래후잔액 + "원");




    }
}
