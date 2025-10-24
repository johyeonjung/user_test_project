package com.korit.study.ch24;

import java.util.*;

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
        //변수에 다시 넣는거라서 원본 데이터는 바뀌지 않음 = copy
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

        //Set 집합
        Set<String> strSet = new HashSet<>();
        strSet.add("나");
        strSet.add("다");
        strSet.add("가");
        System.out.println(strSet);

        String r1 = null;
        String setSerachValue = "다";
        for(String str : strSet){
            if(str.equals(setSerachValue)){
                r1 = str;
                break;
            }

        }
        System.out.println(r1);
        if (strSet.equals(setSerachValue)){
            r1  = setSerachValue;
        }
        System.out.println(r1);

        //값 삭제
        strSet.remove("나");
        System.out.println(strSet);
        //값 수정
        strSet.remove("다");
        strSet.add("라");

        System.out.println(strSet);

        // 리스트 -> 세트
        List<String> a = new ArrayList<>();
        a.add("가");
        a.add("가");
        a.add("나");
        a.add("나");
        a.add("다");
        a.add("라");
        Set<String> b = new HashSet<>();
        for (String s : a) {
            b.add(s);
        }
        System.out.println(b);
        Set<String> c = new HashSet<>();
        c.addAll(a);
        System.out.println(c);

//        List<String> d = new ArrayList<>();
//        d.add(10, "test");

        //Map (키 + 값)
        Map<String, String> strMap = new HashMap<>();

        //값 추가
        strMap.put("a", "김준1");
        strMap.put("b", "김준2");
        strMap.put("c", "김준3");
        strMap.put("d", "김준4");
        strMap.put("d", "김준5");
        System.out.println(strMap);

        //값 조회
        String mapValue = strMap.get("c");
        System.out.println(mapValue);
        String mapValue2 = strMap.getOrDefault( "g", "기본값");
        System.out.println(mapValue2);

        //값 수정
        strMap.put("a", "김준6");

        System.out.println(strMap);

        //값 삭제
        System.out.println(  strMap.remove("a"));
        System.out.println(  strMap.remove("a"));
        System.out.println(  strMap.remove("b", "김준6"));
        System.out.println(  strMap.remove("b", "김준2"));
        System.out.println(strMap);
        System.out.println(strMap.entrySet());
        //Map을 반복 작업하는 방법 : Map 자료형의 Entry가 들어있는 Set자료형으로 형변환
        for(Map.Entry<String, String> entry : strMap.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }

        Set<String> valuseSet = new HashSet<>();
        valuseSet.addAll(strMap.values());







    }
}
