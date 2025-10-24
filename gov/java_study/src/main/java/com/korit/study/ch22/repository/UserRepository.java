package com.korit.study.ch22.repository;

import com.korit.study.ch22.entity.User;

import java.util.Arrays;
import java.util.Objects;

public interface UserRepository {
    User findByUsername(String username);
}












