package com.chapter.ch09.example.sec06.ex01;

public class Button {
    // 정적 중첩 인터페이스
    public static interface ClickListener {
        // 추상 메서드
        void onClick();
    }

    // 필드
    private ClickListener clickListener;

    // 메서드
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    // 버튼이 클릭되었을 때 실행하는 메서드 선언
    public void click() {
        this.clickListener.onClick();
    }
}
