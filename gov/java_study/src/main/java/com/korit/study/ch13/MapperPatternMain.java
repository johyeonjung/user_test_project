package com.korit.study.ch13;

public class MapperPatternMain {
    static void main(String[] args) {
        //Mapper Pattern
        클라이언트에서받은객체 a = new 클라이언트에서받은객체();
        a.username = "test1234";
        a.password =  "1q2w3e4r";
        a.fullName = "김준일";
        a.email = "test@gmail.com";

//        //b에 담긴 데이터를 a에 있는 객체로 전달
//        데이터베이스에보낼객체 b = new 데이터베이스에보낼객체();
//        b.username = a.username;
//        b.password = a.password;
//        b.name = a.fullName;
//        b.email = a.email;

        데이터베이스에보낼객체 c = a.to();



    }
}
