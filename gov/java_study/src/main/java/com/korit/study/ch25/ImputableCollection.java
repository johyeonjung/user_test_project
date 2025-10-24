package com.korit.study.ch25;

import com.korit.study.ch24.Board;
import com.korit.study.ch24.Comment;
import com.korit.study.ch24.Writer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImputableCollection {
    public static void main(String[] args) {
        List<String> iList = new ArrayList<>();
        iList.add("a");
        System.out.println(iList);
        Map<String, List<String>> iMap = Map.of(
                "k1", List.of("김준일", "김준이"),
                "k2", List.of("김준일", "김준3"),
                "k3", List.of("김준일", "김준4"),
                "k4", List.of("김준일", "김준5","김준구")
        );

        List<Board> boards = new ArrayList<>();
        boards.add(new Board("제목1",
                new Writer("김준일",32),
                "내용1",
                List.of(
                        new Comment(new Writer("김준이",32), "댓글1"),
                        new Comment(new Writer("김준이",32), "댓글2")
                )));
        System.out.println(iMap);
        System.out.println(boards);
    }
}
