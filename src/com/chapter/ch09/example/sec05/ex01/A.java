package com.chapter.ch09.example.sec05.ex01;

public class A {
    // A의 인스턴스 필드와 메서드
    int filed1;
    void method1() {}
    
    // A의 정적 필드와 메서드
    static int field2;
    static void method2() {}
    
    // 인스턴스 멤버 클래스
    class B {
        void method() {
            // A의 인스턴스 필드와 메서드 사용
            filed1 = 10;    // 가능
            method1();      // 가능
            
            // A의 정적 필드와 메서드 사용
            field2 = 10;    // 가능
            method2();      // 가능
        }   
    }
    
    // 정적 멤버 클래스
    static class C {
        void method() {
            // A의 인스턴스 필드와 메서드 사용
            // field1 = 10; // 불가
            // method1();   // 불가
            
            // A의 정적 필드와 메서드 사용
            field2 = 10;    // 가능
            method2();      // 가능
        }
        
    }
}
