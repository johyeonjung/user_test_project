package com.korit.study.ch06;


import java.util.Date;

public class 연습문제1 {
    public static void main(String[] args) {
        hello();
        hello1("홍길동");
        System.out.println(give(18));
        System.out.println(timeReturn(11, 46));
        System.out.println(addInt(1,2));
        System.out.println(addDouble(1.0,2.0));
        System.out.println(addThree(1,2,3));
        printInfo("홍길동");
        printInfo("홍길동", 17);
        printInfo("홍길동", 17, "한국대");
        checkTemperatureConversion(36.5);
        System.out.println(calculate(1,2,3,4));
        printStudentInfo("홍길동", 80, 85, 90);
        printStudentInfo("김철수", 95, 88, 92);

    }


    // "안녕하세요!"를 출력하는 함수를 작성하세요
    public static void hello() {
        System.out.println("안녕하세요");
    }

    // 매개변수 있음, 리턴값 없음
    // 이름을 받아서 "안녕하세요, [이름]님!"을 출력하는 함수를 작성하세요
    public static void hello1(String name) {
        System.out.println("안녕하세요" +  name + "님!");
    }

    // 매개변수 있음, 리턴값 있음
    // 정수를 받아서 제곱값을 반환하는 함수를 작성하세요
    public static int give(int number) {
        return number * number;
    }

    // 매개변수 없음, 리턴값 있음
    // 현재 시간을 "현재 시간입니다"라는 문자열로 반환하는 함수를 작성하세요
    public static String timeReturn(int hours, int minutes) {
        Date now = new Date();
        int nowHours = now.getHours();
        int nowMinutes = now.getMinutes();

        return hours == nowHours && minutes == nowMinutes ? "현재 시간 입니다" : "아닙니다";

    }

    // 정수 2개를 더하는 함수
    public static int addInt(int a, int b) {
        return a + b;
    }

    // 실수 2개를 더하는 함수를 오버로딩으로 작성하세요
    public static double addDouble(double a, double b) {
        // 여기에 코드 작성
        return a + b;
    }

    // 정수 3개를 더하는 함수를 오버로딩으로 작성하세요
    public static int addThree(int a, int b, int c) {
        // 여기에 코드 작성
        return a + b + c;
    }

    // 이름만 출력하는 함수
    public static void printInfo(String name) {
        System.out.println("이름: " + name);
    }

// 이름과 나이를 출력하는 함수를 오버로딩으로 작성하세요


    public static void printInfo(String name, int age) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }


// 이름, 나이, 학교를 출력하는 함수도 오버로딩으로 작성하세요

    public static void printInfo(String name, int age, String school) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("학교: " + school);
    }

    // 섭씨를 화씨로 변환하는 함수
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    // 화씨를 섭씨로 변환하는 함수
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // 섭씨 온도를 받아서 화씨로 변환한 후, 다시 섭씨로 변환하여
    // 원래 값이 맞는지 확인하는 함수를 작성하세요
    public static void checkTemperatureConversion(double celsius) {
        // 여기에 중첩 함수 호출 코드 작성
        if (celsiusToFahrenheit(celsius) == fahrenheitToCelsius(celsius)) {
            System.out.println("같음");
        } else {
            System.out.println("틀림");
        }
        ;
    }

        public static int add(int a, int b) { return a + b; }
        public static int multiply(int a, int b) { return a * b; }
        public static int subtract(int a, int b) { return a - b; }

// (a + b) * c - d 를 계산하는 함수를
// 위의 함수들을 이용해서 작성하세요
        public static int calculate(int a, int b, int c, int d) {
            // 여기에 중첩 함수 호출 코드 작성

            return multiply(add(a,b),subtract(c,d));
        }

        // 평균을 계산하는 함수 (정수 2개)
        public static double average(int score1, int score2) {
            return (int)((score1 + score2 )/2);
        }

        // 평균을 계산하는 함수 (정수 3개) - 오버로딩
        public static double average(int score1, int score2, int score3) {
            return (int)((score1 + score2 + score3 )/3);
        }

        // 등급을 반환하는 함수
        public static char getGrade(double average) {
            // 90이상: A, 80이상: B, 70이상: C, 그 외: F
            if (average >= 90) {
                return 'A';

            } else if (average >= 80) {
                return 'B';

            } else if (average >= 80) {
            return 'C';

            } else {
                return 'F';
            }
        }
        // 학생 정보를 출력하는 함수
        public static void printStudentInfo(String name, int score1, int score2, int score3) {
            // average()와 getGrade() 함수를 호출하여 학생 정보를 출력하세요
            // 출력 형식: "홍길동 학생의 평균: 85.0, 등급: B"
            int score = (int) average(score1,score2,score3);
            System.out.println( name +"의 학생의 평균:" +  score + ", 등급: " +  getGrade(score) );
        }



    }









