package com.chapter.ch09.example.sec06.ex03;

public class HomeExample {
    public static void main(String[] args) {
        // Home 객체 생성
        Home home = new Home();

        // 익명 구현 객체가 대입된 필드 사용
        home.use1();
        
        // 익명 구현 객체가 대입된 로컬변수 사용
        home.use2();
        
        // 익명 구현 객체가 대입된 매개변수 사용
        home.use3(new RemoteControl() {
            @Override
            public void tunOn() {
                System.out.println("난방을 킴");
            }

            @Override
            public void turnOff() {
                System.out.println("난방을 끔");
            }
        });
    }
}
