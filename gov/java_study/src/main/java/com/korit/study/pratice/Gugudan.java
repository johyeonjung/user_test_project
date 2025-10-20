package com.korit.study.pratice;

import java.util.Scanner;

public class Gugudan{
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int startDan = scanner.nextInt();
//        int endDan = scanner.nextInt();
//        int result = 0;
//
//        int x = endDan - startDan + 1;
//
//        // 여기에 코드를 작성하세요
//        // 입력 순서와 Scanner 메서드 조합에 주의
//        for (int i = 0; i < x ; i++) {
//            System.out.println("    " + startDan +"단");
//            for (int j = 0; j < 9 ; j++) {
//                int k = j + 1;
//                result = startDan * k;
//                System.out.printf(" %d * %d = %d\n",startDan, k, result);
//            }
//            startDan++;
//        }
        Scanner scanner = new Scanner(System.in);
        int startDan = 3;
        int endDan = 5;
        int result = 0;

        int x = endDan - startDan + 1;

        // 여기에 코드를 작성하세요
        // 입력 순서와 Scanner 메서드 조합에 주의
        for (int i = 0; i < x ; i++) {
            System.out.println("    " + endDan +"단");
            for (int j = 0; j < 9 ; j++) {
                int num = 9 - j;
                result = endDan * num;
                System.out.printf(" %d * %d = %d\n",endDan, num, result);
            }
            endDan--;
        }


        scanner.close();
    }
}