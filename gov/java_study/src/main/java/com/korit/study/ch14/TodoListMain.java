package com.korit.study.ch14;

public class TodoListMain {
    static void main(String[] args) {
        //의존성 주입
        UserList userList = new UserList();
        UserService userService = new UserService(userList);
        TodoList todoList = new TodoList();
        TodoService todoService = new TodoService(todoList);
        TodoListView view = new TodoListView(userService, todoService);
        view.homeView();
        System.out.println("==<< 프로그램 종료 >>==");
    }
}
