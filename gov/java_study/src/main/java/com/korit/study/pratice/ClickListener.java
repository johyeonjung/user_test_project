package com.korit.study.pratice;
interface ClickListener {
    void onClick();
}

class Button {
    private ClickListener listener;

    public void setClickListener(ClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        if (listener != null) {
            listener.onClick();
        }
    }
}

