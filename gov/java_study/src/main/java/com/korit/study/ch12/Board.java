package com.korit.study.ch12;
//Board - id(정수), title(문자열), content(문자열), writer(writer), comments(comment[])
public class Board {
    int id;
    String title;
    String content;
    Writer writer;
    Comment[] comments;

    Board(int id, String title, String content, Writer writer, Comment[] comments) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.comments = comments;
    }


}
