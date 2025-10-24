package com.korit.study.ch22.repository;

import com.korit.study.ch22.entity.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class UserRepositorylmpl implements UserRepository {
    private static UserRepositorylmpl instance;
    private List<User> users;
    private int autoIncrementId;

    private UserRepositorylmpl() {
        users = new ArrayList<>();
        autoIncrementId = 1;
    }
    //가비지 컬렉터가 생기지 않게 ??
    //싱글톤?? 회원정보가 사라짐
    public static UserRepositorylmpl getInstance() {
        if (Objects.isNull(instance)) {
            instance = new UserRepositorylmpl();
        }
        return instance;
    }

    public void insert(User user) {
        user.setId(autoIncrementId++);
        users.add(user);
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("User 배열: [ ");
        for (int i = 0; i < users.size(); i++) {
            stringBuilder.append(users.get(i));
            if (i != users.size() - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append(" ]");

        return stringBuilder.toString();
    }
}











