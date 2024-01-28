package com.chapter.ch09.example.sec06.ex03;

public class Home {
    // 필드에 익명 구현 객체 타입
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void tunOn() {
            System.out.println("TV 켬");
        }

        @Override
        public void turnOff() {
            System.out.println("TV 끔");
        }
    };

    // 메서드 (필드 이용)
    public void use1() {
        rc.tunOn();
        rc.turnOff();
    }

    // 메서드 (로컬 변수 이용)
    public void use2() {
        // 로컬 변수에 익명 구현 객체 대입
        RemoteControl rc = new RemoteControl() {
            @Override
            public void tunOn() {
                System.out.println("에어컨 킵");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨 끔");
            }
        };
        rc.tunOn();
        rc.turnOff();
    }

    // 메서드 (매개변수 이용)
    public void use3(RemoteControl rc) {
        rc.tunOn();
        rc.turnOff();
    }
}
