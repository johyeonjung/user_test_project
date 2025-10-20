package com.korit.study.ch12;

import com.korit.study.ch11.Study;

public class BoardMain {
    static void main(String[] args) {
        //Board배열 boards -> 게시글 2개


        //Board - id(정수), title(문자열), content(문자열), writer(writer), comments(comment[])


        //Writer - id(정수), name(문자열)

        //Comment - id (정수), contents(문자열), writer(writer)
//
//        Writer writer1 = new Writer(1, "홍길동");
//        Writer writer2 = new Writer(2, "김철수");
//        Writer writer3 = new Writer(3, "곽철수");
//
        Writer[] writers = new Writer[3];
        writers[0] = new Writer(1, "홍길동");
        writers[1] = new Writer(2, "김철수");
        writers[2] = new Writer(3, "곽철수");

        //배열을 묶는 배열
        //전체 크기는 배열이 생성될때 만들어져야 하고 [2][]
        // 그 안의 크기는 늘릴 수 있음 [2][0], [2][1] , [2][2] ,[2][3] , [2][4] ......
        Comment[][] comments = new Comment[2][];
        comments[0] = new Comment[3];
        comments[1] = new Comment[3];
        comments[0][0] = new Comment(1, "게시글1의 댓글 내용입니다", writers[0]);
        comments[0][1] = new Comment(2, "게시글1 댓글 내용입니다", writers[0]);
        comments[0][2] = new Comment(3, "게시글1 댓글 내용1입니다", writers[2]);
        comments[1][0] = new Comment(4, "게시글2 댓글 내용입니다", writers[1]);
        comments[1][1]= new Comment(5, "게시글2 댓글 내용입니다", writers[0]);
        comments[1][2] = new Comment(6, "게시글2 댓글 내용1입니다", writers[2]);



//        Comment[] comments1 = {comment1,  .comment2};
//        Comment[] comments2 = {comment3, comment4};


        Board[] boards = new Board[2];

       boards[0] = new Board(1, "제목입니다1", "내용입니다1", writers[1] , comments[0]);
       boards[1] = new Board(2, "제목입니다2", "내용입니다2", writers[1] , comments[1]);

        BoardPrintService boardPrintService = new BoardPrintService();
        boardPrintService.printInfoAll(boards);










    }
}
