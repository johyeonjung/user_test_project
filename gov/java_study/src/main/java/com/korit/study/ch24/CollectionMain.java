package com.korit.study.ch24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
        //문자열을 담을 수 있는 ArrayList 생성
        List<String> list = new ArrayList<>();

        //값을 추가
        list.add("문자열 값1");
        list.add("문자열 값1");

        //값을 가져오기
        String str1 = list.get(0);
        String str2 = list.get(1);

        //값을 수정
        list.set(1,"문자열 값 3");

        boolean removed = list.remove("문자열 값1");
        String str4 = list.remove(0);
        System.out.println(removed);

        //리스트의 크기(사이즈)
        int size = list.size();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("30");
        list.add("30");
        list.contains("50");

        list.indexOf("20");
        int index0f30 = list.indexOf("30"); //앞에서부터 찾음

        // 리스트 자르기
        System.out.println(list.subList(0, 2)); // 0부터 2 전까지 자르기
        List<String> subList = list.subList(list.indexOf("30") + 1, list.size());
        subList.indexOf("30");
        LinkedList<String> subList1 = new LinkedList<>();
        subList1.add("10");
        subList1.add("20");
        subList1.add("30");
        subList1.add("40");


        //중간에 위치하고 있는 데이터 30 의 index를 찾는 방법
        //break걸면 첫번째, 안 걸면 마지막 인덱스를 찾음
         int start = list.indexOf("30") + 1;
         index0f30 = -1;
        for (int i = start; i < list.size(); i++) {
            if(list.get(i).equals("30")){
                index0f30 = i;
                break;
            }
        }
        System.out.println(index0f30);


        index0f30 = list.lastIndexOf("30"); //뒤에서부터 찾음
        System.out.println(index0f30);


    }
}
