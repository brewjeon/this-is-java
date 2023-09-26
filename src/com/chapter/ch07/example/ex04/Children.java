package com.chapter.ch07.example.ex04;

public class Children {
    // 같은 패키지
    void childrenMethod() {
        ProtectedClass protectedClass = new ProtectedClass();
        protectedClass.protectedMethod();
    }
}
