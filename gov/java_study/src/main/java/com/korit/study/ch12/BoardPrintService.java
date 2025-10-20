package com.korit.study.ch12;

import com.korit.study.ch11.Student;

public class BoardPrintService {

    void printInfoAll(Board[] boards) {
        System.out.println("------------게시물 정보------------");
        for (int i = 0; i < boards.length; i++) {
            Board board = boards[i];
            System.out.println("게시글 ID" + board.id);
            System.out.println("게시글 제목" + board.title);
            System.out.println("게시글 내용" + board.writer.id);
            System.out.println("게시글 작성자 ID" + board.writer.name);
            for (int j = 0; j < board.comments.length; j++) {
                Comment comment = board.comments[j];
                System.out.println("댓글 ID" + comment.id);
                System.out.println("댓글 작성자 ID" + comment.writer.id);
                System.out.println("댓글 작성자 내용" + comment.contents);
                System.out.println("댓글 작성자 이름" + comment.writer.name);

            }
            System.out.println();

        }
        for (Board board : boards) {
            System.out.println("게시글 ID" + board.id);
            System.out.println("게시글 제목" + board.title);
            System.out.println("게시글 내용" + board.writer.id);
            System.out.println("게시글 작성자 ID" + board.writer.name);
            for (Comment comment : board.comments) {
                System.out.println("댓글 ID" + comment.id);
                System.out.println("댓글 작성자 ID" + comment.writer.id);
                System.out.println("댓글 작성자 내용" + comment.contents);
                System.out.println("댓글 작성자 이름" + comment.writer.name);
            }


        }
    }
}

//    void printInfoComments(Comment[] comments) {
//
//        }
//    }

//    void printInfoComment(Comment comment) {
//        System.out.println("------------댓글 정보------------");
//        System.out.println("댓글 작성자: " + comment.writer.name);
//        System.out.println("댓글 내용: " + comment.contents);
//    }
//
//    void printInfoWriter(Writer writer) {
//        // System.out.println(writer.id);
//        System.out.println("------------작성자 정보------------");
//        System.out.println("작성자 이름: " + writer.name);
//    }

