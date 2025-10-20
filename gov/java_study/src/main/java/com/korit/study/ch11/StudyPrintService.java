package com.korit.study.ch11;

public class StudyPrintService {

    void printInfoAll(Study study) {
        printInfoSubject(study.subject);
        printInfoStudents(study.students);
    }

    void printInfoSubject(Subject subject) {
        System.out.println("[과목정보]");
        System.out.println("과목명" + subject.name);
        System.out.println(subject.teacher);
    }

    void printInfoTeacher(Teacher teacher) {
        System.out.println("선생 정보");
        System.out.println("선생 이름" + teacher.name);
        System.out.println("선생 나이" + teacher.age);

    }

    void printInfoStudents(Student[] students) {
        for (Student student : students) {
            printInfoStudent(student);

        }
    }

    void printInfoStudent(Student student) {
        System.out.println("학생정보");
        System.out.println("학생 학번: " + student.id);
        System.out.println("학생 이름: " + student.name);
        System.out.println("학생 나이: " + student.age);
    }
}
