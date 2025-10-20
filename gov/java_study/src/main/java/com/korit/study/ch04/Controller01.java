package com.korit.study.ch04;

import javax.swing.*;

public class Controller01 {
    public static void main(String[] args) {
        int num = 10;

        String text = num > 5 ? "5보다 큼" : "5보다 작음";
        System.out.println(text);

        if (num > 5) {
            System.out.println("5보다 큼");
        } else {
            System.out.println("5이하 입니다.");
        }


        int score = 85;


        if (score >= 95) {
            System.out.println("A+");
        } else if (score >= 90) {
                System.out.println("A");
        } else if (score >= 85) {
                System.out.println("B+");
        } else {
             System.out.println("B");
        }

    }
}
