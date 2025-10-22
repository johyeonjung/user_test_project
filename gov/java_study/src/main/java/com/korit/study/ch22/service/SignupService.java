package com.korit.study.ch22.service;

import com.korit.study.ch21.Singleton;
import com.korit.study.ch22.dto.SignupDto;
import com.korit.study.ch22.entity.User;
import com.korit.study.ch22.repository.UserRepository;
import com.korit.study.ch22.util.PasswordEncoder;

import java.util.Objects;

public class SignupService {
    // 1. instance static 변수 정의
    private static SignupService instance;
    private UserRepository userRepository;

    private SignupService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }


    //getter을 통해서 접근해야 해서 public 접근 제한자를 가지고 있음
    public static SignupService getInstance() {

        //맨 처음이면 true, 처음이면 instance에 대입하겠다 라는 뜻임
        if (Objects.isNull(instance)) {
            instance = new SignupService(UserRepository.getInstance());
        }
        return instance;
    }

    public boolean isValidDuplicatedUsername(String username) {
        User foundUser = userRepository.findByUsername(username);
        if (Objects.isNull(foundUser)) {
            return true;
        }
        return false;
    }

    public boolean isValidPassword(String password) {

        return !Objects.isNull(password) && !password.isBlank();
    }

    public boolean isValidConfirmPassword(String password, String confirmPassword) {
        if (Objects.isNull(password) || Objects.isNull(confirmPassword)) {
            return false;
        }
        return password.equals(confirmPassword);
    }

    public void signup(SignupDto signupDto) {
//        User newUser = new User(0, signupDto.getUsername(), PasswordEncoder.encode(signupDto.getPassword()));

        // UserRepository.getInstance().insert(signupDto.toUser()); 와 동일하다
        userRepository.insert(signupDto.toUser());

    }
}










