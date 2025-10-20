package com.korit.study.pratice;

import java.util.Scanner;

import static java.lang.Long.sum;

public class StudentInfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 여기에 코드를 작성하세요
        // next(), nextInt(), nextLine() 모두 사용
        System.out.print("학생 이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("학생 나이를 입력하세요: ");
        int age = Integer.parseInt(scanner.nextLine());


        System.out.print("학생 학년을 입력하세요: ");
        int grade = Integer.parseInt(scanner.nextLine());

        System.out.print("국어 점수를 입력하세요: ");
        double korea = scanner.nextDouble();

        System.out.print("영어 점수를 입력하세요: ");
        double english = scanner.nextDouble();

        System.out.print("수학 점수를 입력하세요: ");
        double math = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("자기소개를 입력하세요: ");
        String me = scanner.nextLine();

        double avg =  (korea + english + math) / 3;
        String x =avg < 60 ? "F" : avg < 65 ? "D" : avg < 70 ? "D+" :avg < 75 ? "C" : avg <80 ? "C+" : avg < 85 ? "B" : avg < 90 ? "B+" : avg < 95 ? "A" : "A+";

        System.out.println("=== 학생 정보 ===");
        System.out.printf("""
                이름: %s
                나이: %d세 (고등학교 2학년)
                성적:
                    국어: %.2f점
                    영어: %.2f점
                    수학: %.2f점
                    평균: %.2f점 (학점: %s)
                자기소개: %s%n""", name, age, korea, english, math, avg, x, me);




        scanner.close();

    }


}
