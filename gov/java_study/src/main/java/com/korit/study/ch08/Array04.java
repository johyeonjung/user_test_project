package com.korit.study.ch08;

import java.util.Scanner;

public class Array04 {
    public static String[] names = new String[]
            {"김준일", "김준이", "김준삼", "김준사",
                    "김준오", "김준육", "김준칠", "김준팔", "김준구"};

    static void main(String[] args) {
        //추가(Create), 조회(Read), 수정(Update), 삭제(Delete)
        System.out.println("[ 이름 관리 시스템 ]");
        showMainMenuView();

    }
    public static void showMainMenuView() {
        Scanner sc = new Scanner(System.in);
        boolean isExit = false;

        //true면 동작, false 가 되면 동작 중지
        while (!isExit) {
            System.out.println("1. 이름 추가");
            System.out.println("2. 이름 조회");
            System.out.println("3. 이름 수정");
            System.out.println("4. 이름 삭제");
            System.out.println("0. 종료");

            System.out.print("선택: ");
            int selectedNumber = sc.nextInt();
            sc.nextLine();


            if(selectedNumber == 0) {
                //!isExit가 False가 돼서 while문 종료
                isExit = true;
            } else if (selectedNumber == 1) {
                register();
            } else if (selectedNumber == 2) {
                showNameList();
            }
        }
    }

    public static void register() {
        Scanner sc = new Scanner(System.in);
        String newName = null;

        while (true) {
            System.out.println("[이름 추가 기능]");
            System.out.println("이름 입력: ");
            newName = sc.nextLine();

            if (findByName(newName) == null) {
                break;
            }
            System.out.println("이미 존재하는 이름입니다. 다시 입력하세요.");
        }
        add(newName);
        System.out.println("이름 추가 완료 ^ w ^");
    }


    public static String findByName(String name) {
        for (String n : names) {
            if (n.equals(name)) {
                return n;
            }
        }
        return null;
    }

    public static void add(String name) {
        String[] newArray = new String[names.length + 1];
        for(int i = 0; i < names.length; i++) {
            newArray[i] = names[i];
        }
        newArray[newArray.length - 1] = name;
        names = newArray;
    }

    public static void showNameList() {
        Scanner sc = new Scanner(System.in);
        int size = 2;
        while (true) {
            System.out.println("사용자 정보 조회");
            System.out.println("뒤로 가려면 0을 입력하세요");
            System.out.printf("페이지 번호 입력(1 ~ %d): ", getLastPage(size));
            int selectedPage = sc.nextInt();
            sc.nextLine();

            if (selectedPage == 0) {
                break;
            } else if (selectedPage > getLastPage(size)) {
                System.out.println("해당 페이지는 찾을 수 없습니다");
            } else {
                String[] namesOfPagination = pagination(selectedPage, size);
                for (int i = 0; i < namesOfPagination.length; i++) {
                    System.out.printf("%d. %s\n", i + 1, namesOfPagination[i]);
                }
                System.out.println();
            }

        }

    }

    public static int getLastPage(int size) {
        return names.length % size == 0 ? names.length / size : names.length / size + 1;
        // 사이즈 : 9
        // 마지막 페이지 : 5 ( 9 / 2 + 1 )
    }


    // 0 1 2 3 / 4 5 6 7 / 8

    public static String[] pagination(int page, int size) {
        int startIndex = (page - 1) * size; // 0 2 4 6 8
        int lastPage = getLastPage(size);
        boolean isLast = page == lastPage;
        // 마지막 페이지의 사이즈
        // 마지막 페이지냐? 맞음 : size로 나눈 나머지가 마지막 페이지크기 여기서는 크기 1
        // 마지막 페이지가 아니면 size 그대로 4개의 크기임
        int paginationArraySize = isLast && names.length % size == 0 ? names.length % size : size;


        String[] paginationArray = new String[paginationArraySize];
        // 시작하는 인덱스부터 4개 혹은 마지막페이지 크기 둘 중 하나를 더함
        for (int i = startIndex; i < startIndex + paginationArraySize; i++) {
            paginationArray[i - startIndex] = names[i];
        }
        return paginationArray;


    }
}
