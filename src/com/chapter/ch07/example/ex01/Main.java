package com.chapter.ch07.example.ex01;

public class Main {
    public static void main(String[] args) {
        System.out.println("ChildrenClass 클래스를 인스턴스화 하여 childrenClass 인스턴스를 생성한다.");
        ChildrenClass childrenClass = new ChildrenClass("test");

        System.out.println("childrenClass 객체를 통해 상속 받은 parentClassMethod를 실행한다.");
        childrenClass.parentClassMethod();
    }
}
