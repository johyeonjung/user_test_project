package com.korit.study.ch24;


import java.util.*;

public class BoardMain {
    public static void main(String[] args) {
        // 게시판
        //title writer content comments


        Map<String, Object> writer1 = new HashMap<>();
        writer1.put("name", "김준일");
        writer1.put("age", 32);

        Map<String, String> comment1_1 = new HashMap<>();
        comment1_1.put("writer", "김준이");
        comment1_1.put("content", "댓글 내용1");

        Map<String, String> comment1_2 = new HashMap<>();
        comment1_2.put("writer", "김준삼");
        comment1_2.put("content", "댓글 내용2");

        List<Map<String, String>> comments1 = new ArrayList<>();
        comments1.add(comment1_1);
        comments1.add(comment1_2);

        Map<String, Object> board1 = new HashMap<>();
        board1.put("title", "게시판 제목1");
        board1.put("writer", writer1);
        board1.put("content", "게시판 내용1");
        board1.put("comments", comments1);

        Map<String, Object> writer2 = new HashMap<>();
        writer2.put("name", "김준사");
        writer2.put("age", 34);

        Map<String, String> comment2_1 = new HashMap<>();
        comment2_1.put("writer", "김준오");
        comment2_1.put("content", "댓글 내용11");

        Map<String, String> comment2_2 = new HashMap<>();
        comment2_2.put("writer", "김준육");
        comment2_2.put("content", "댓글 내용22");

        List<Map<String, String>> comments2 = new ArrayList<>();
        comments2.add(comment2_1);
        comments2.add(comment2_2);

        Map<String, Object> board2 = new HashMap<>();
        board2.put("title", "게시판 제목2");
        board2.put("writer", writer2);
        board2.put("content", "게시판 내용2");
        board2.put("comments", comments2);

        List<Map<String, Object>> boards = new ArrayList<>();
        boards.add(board1);
        boards.add(board2);

        for (Map<String, Object> board : boards) {
            System.out.println("title: " + board.get("title"));
            System.out.println("writer : " + ((Map<String, String>) board.get("writer")).get("name"));
            System.out.println("content : " + board.get("content"));

            System.out.println("comments :");
            List<Map<String, String>> comments = (List<Map<String, String>>) board.get("comments");
            for (Map<String, String> comment : comments) {
                System.out.println("   - " + comment.get("writer") + ": " + comment.get("content"));
            }
            System.out.println();
        }


        /**
         * [
         *      {
         *          "title": "게시판 제목1",
         *          "writer": {
         *              "name": "김준일",
         *              "age": 32
         *          },
         *          "content": "게시판 내용1",
         *          "comments": [
         *              {
         *                  "writer": "김준이",
         *                  "content": "댓글 내용1"
         *              },
         *              {
         *                  "writer": "김준삼",
         *                  "content": "댓글 내용2"
         *              },
         *          ]
         *      },
         *      {
         *          "title": "게시판 제목2",
         *          "writer": {
         *              "name": "김준사",
         *              "age": 34
         *          },
         *          "content": "게시판 내용2",
         *          "comments": [
         *              {
         *                  "writer": "김준오",
         *                  "content": "댓글 내용11"
         *              },
         *              {
         *                  "writer": "김준육",
         *                  "content": "댓글 내용22"
         *              },
         *          ]
         *      },
         * ]
         */
    }
}