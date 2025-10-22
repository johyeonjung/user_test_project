package com.korit.study.ch23;

public class Generic<T, T2> {
    private T data;
    private T data2;
    private T2 data3;

    public Generic(T data, T data2) {
        this.data = data;
        this.data2 = data2;
    }
}
