package com.chapter.ch09.example.sec06.ex02;

public class Car {
    // 필드에 Tire 객체 타입
    private Tire tire1 = new Tire();

    // Tire 가 부모가 됨.
    private Tire tire2 = new Tire() {   // 이름 없는 익명 자식 객체를 간단하게 만들어서 대입을 하겠다.
        @Override
        public void roll() {
            System.out.println("익명 자식 Tire 객체 1이 굴러간다.");
        };
    };

    // 메서드 (필드 이용)
    public void run1() {
        tire1.roll();   // "일반 타이어가 굴러간다."
        tire2.roll();   // "익명 자식 Tire 객체 1이 굴러간다."
    }

    // 메서드 (로컬 변수 이용)
    public void run2() {
        // 로컬 변수에 익명 자식 객체 대입
        Tire tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("익명 자식 Tire 객체 2가 굴러간다.");
            };
        };
        tire.roll();    // "익명 자식 Tire 객체 2가 굴러간다."
    }

    // 메서드 (매개변수 이용)
    public void run3(Tire tire) {
        tire.roll();
    }
}
