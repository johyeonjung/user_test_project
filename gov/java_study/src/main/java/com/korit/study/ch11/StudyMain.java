package com.korit.study.ch11;

public class StudyMain {

    Student studentWho;

    static void printStudent(int i, Student studentWho) {

        System.out.printf("학생" + i + " ID: %d \n", studentWho.id);
        System.out.printf("학생" + i + " 이름: %s \n", studentWho.name);
        System.out.printf("학생" + i + " 나이: %d \n", studentWho.age);
    }


    static void main(String[] args) {
        // 과목명: JAVA 기초
        // 담당 선생님 이름: 김준일
        // 담당 선생님 나이: 32

        // 학생1 ID: 20250001
        // 학생1 이름: 박재현
        // 학생1 나이: 24

        //학생2 ID: 20250002
        //학생2 이름: 고대한
        //학생2 나이: 19

        //학생3 ID: 20250003
        //학생3 이름: 양재원
        //학생3 나이: 27

        //스터디 객체를 생성하시오
        Student s1 = new Student(20250001, "박재현", 24);
        Student s2 = new Student(20250002, "고대한", 19);
        Student s3 = new Student(20250003, "양재원", 27);

        Student[] students = {s1, s2, s3};

        Teacher t = new Teacher("JAVA 기초", 32);

        Subject sb = new Subject("김준일", t);

        Study study = new Study(sb,students);

        System.out.println("과목명: " + sb.name);
        System.out.println("담당 선생님 이름: " + sb.teacher.name);
        System.out.println("담당 선생님 나이: " + sb.teacher.age);

        printStudent(1, s1);
        printStudent(2, s2);
        printStudent(3, s3);

        StudyPrintService studyPrintService = new StudyPrintService();
        studyPrintService.printInfoAll(study);


    }
}
