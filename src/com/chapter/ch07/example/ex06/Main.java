package com.chapter.ch07.example.ex06;
public class Main {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.filed1 = "test";
        parent.method1();
        parent.method2();

        // ❌ 불가능
        // parent.field2 = "test";
        // parent.method3();

        // filed2와 method3를 사용하기 위해서 강제 타입 변환으로 복원
        Child child = (Child) parent;
        child.field2 = "test";
        child.method3();
    }
}
