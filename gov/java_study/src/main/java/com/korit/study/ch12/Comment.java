package com.korit.study.ch12;
//Comment - id (정수), contents(문자열), writer(writer)
public class Comment {
    int id;
    String contents;
    Writer writer;


    Comment(int id, String contents, Writer writer) {
        this.id = id;
        this.contents = contents;
        this.writer = writer;
    }
}
