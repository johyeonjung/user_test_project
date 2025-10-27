package com.korit.study.pratice;

public class ClickMain {
    public static void main(String[] args) {
        Button button = new Button();

        // TODO: 여기에 익명 클래스를 사용하여 ClickListener 구현
        ClickListener clickListener = new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("클릭되었습니다");
            }
        };
        button.setClickListener(clickListener);
        clickListener.onClick();

    }

}
