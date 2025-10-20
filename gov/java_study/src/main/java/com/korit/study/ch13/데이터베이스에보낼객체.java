package com.korit.study.ch13;

public class 데이터베이스에보낼객체 {
    String username;
    String password;
    String name;
    String email;

    //덮어쓰기 하니까 빈생성자 하나를 만들어야줘야 함
    데이터베이스에보낼객체() {

    }


    데이터베이스에보낼객체(String username, String password, String name, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;

    }


}
