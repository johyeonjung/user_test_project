package com.korit.study.ch14;

import java.time.LocalDateTime;

public class Todo {
    int id;
    String contents;
    User user;
    LocalDateTime createdAt;


    public Todo(int id, String content, User user, LocalDateTime createdAt) {
        this.id = id;
        this.contents = content;
        this.user = user;
        this.createdAt = createdAt;
    }


    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", content='" + contents + '\'' +
                ", user=" + user +
                ", createdAt=" + createdAt +
                '}';
    }
}
