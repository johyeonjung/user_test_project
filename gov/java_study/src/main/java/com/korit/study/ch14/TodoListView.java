package com.korit.study.ch14;

import java.util.Scanner;

public class TodoListView{
    Scanner scanner;
    User principal;
    UserService userService;
    TodoService todoService;



    TodoListView(UserService userService, TodoService todoService) {
        scanner = new Scanner(System.in);
        this.userService = userService;
        this.todoService = todoService;
    }


    void homeView() {

        while (true) {
            System.out.println("[ TodoList ]");
            System.out.println("1.TodoList");
            if (principal == null) {
                System.out.println("2. 회원가입");
                System.out.println("3. 로그인");
            } else {
                //principal 에 회원가입한 유저 또는 가입되어 있는 founduser 정보가 들어감
                // pricipal이 채워짐 = else 로 실행
                System.out.println("2. 로그아웃");
            }
            System.out.println("q. 프로그램 종료");
            System.out.println(">> ");
            String cmd = scanner.nextLine();

            if ("q".equals(cmd)) {
                break;
            } else if ("1".equals(cmd)) {
                //TodoList 관리
                if (principal == null) {
                    System.out.println("로그인 후 사용가능합니다");
                    continue;
                }
                todoListMenuView();
                System.out.println();
            } else if ("2".equals(cmd) && principal == null) {
                //회원가입
                signupView();
            } else if ("2".equals(cmd) && principal != null) {
                //로그아웃
                principal = null;
                System.out.println("==<< 로그아웃 완료 !! >>==");
            } else if ("3".equals(cmd) && principal == null) {
                //로그인
                signinView();
            }
        }
    }

    void signinView() {
        System.out.println("[ 로그인 ]");
        System.out.println("username >> ");
        String username = scanner.nextLine();
        System.out.println("password >> ");
        String password = scanner.nextLine();
        SigninDto signinDto = new SigninDto(username, password);
        User foundUser = userService.signin(signinDto);

        if (foundUser == null) {
            System.out.println("사용자 정보를 다시 확인하세요");
            return;

        }
        principal = foundUser;
        System.out.println("==<< 로그인 완료!! >>==");

    }

    void signupView() {
        System.out.println("[ 회원가입 ]");
        String username = null;
        while(true) {
            System.out.print("username >> ");
            username = scanner.nextLine();
            if (!userService.isDuplicationUsername(username)) {
                break;
            }
            System.out.println("이미 존재하는 아이디입니다.");
        }
        System.out.println("password >> ");
        String password = scanner.nextLine();
        System.out.println("name >> ");
        String name = scanner.nextLine();
        SignupDto signupDto = new SignupDto(username, password, name);
        System.out.println(signupDto.toString());
        userService.signup(signupDto);
        System.out.println("==<< 회원가입 완료!! >>==");
        userService.printUserListAll();

    }
    void todoListMenuView() {
        while(true) {
            System.out.println(" [ TodoList ]");
            System.out.println(" 1. Todo 등록");
            System.out.println(" 2. Todo 조회");
            System.out.println("b. 뒤로 가기");
            System.out.println(">> ");
            String cmd = scanner.nextLine();

            if ("b".equals(cmd)) {
                break;
            } else if ("1".equals(cmd)) {
                System.out.println("[ Todo 등록 ]");
                System.out.println("오늘 할 일 >>");
                String contents = scanner.nextLine();
                TodoRegisterDto todoRegisterDto = new TodoRegisterDto(contents, principal);
                System.out.println("==<< Todo 등록 완료 >>==");
            } else if  ("2".equals(cmd)) {
                System.out.println("[ Todo 조회 ]");
                todoService.printAllByUserId(principal);
            }
        }
    }
}
