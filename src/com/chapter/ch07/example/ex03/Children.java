package com.chapter.ch07.example.ex03;

import com.chapter.ch07.example.ex04.ProtectedClass;

public class Children extends ProtectedClass{
    // 다른 패키지
    public Children() {
        super();
        this.protectedMethod();
        method();
    }

    public void method () {
        this.protectedMethod();
    }
}
