package com.korit.study.pratice;

public class star {
    static void main() {
        //다이아몬드 출력
        int num = 15;
        for (int i =0; i < num; i++) {

            // num / 2 : 다이아몬드의 절반 기준, 피라미드 모양
            //중앙보다 크냐 작냐가 삼항의 기준
            // num - i < 감소하는 for문 응용
            System.out.println(i < (num / 2) ? (i * 2) + 1 : ((num - i - 1 ) * 2 ) + 1);
        }

        // 5 4 3 2 1 0 1 2 3 4 5
        for (int i =0; i < num; i++) {
            System.out.println((i < num / 2 ) ? (num / 2) - i : i - (num / 2));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(10 - i);
        }


    }
}
