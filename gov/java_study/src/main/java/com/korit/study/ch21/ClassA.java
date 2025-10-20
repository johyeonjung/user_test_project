package com.korit.study.ch21;

public class ClassA {

    public void run() {
        //singleton 생성해서 static아니어도 쓸수있게 함
        // 목적 : 공유해서 쓰고 싶다 굳이 두개 만들필요 ㄴㄴ

        Singleton.getInstance().changeData();
        Singleton.getInstance().deleteData();
    }
}
