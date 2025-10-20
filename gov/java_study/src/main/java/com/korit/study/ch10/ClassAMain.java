package com.korit.study.ch10;

public class ClassAMain {
    static void main(String[] args) {
        ClassA a = new ClassA();
        a.name = "김준일";
        a.age = 32;

        ClassB b = new ClassB("김준이", 33);
        System.out.println(b.name);

        ClassC c = new ClassC("김준삼", 34);
        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.address);

        ClassC d = new ClassC("김준오", 35,"주소");
        System.out.println(d.name);
        System.out.println(d.age);
        System.out.println(d.address);









        

    }
}
