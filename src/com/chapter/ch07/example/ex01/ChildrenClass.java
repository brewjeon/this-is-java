package com.chapter.ch07.example.ex01;

public class ChildrenClass extends ParentClass {
    String childrenClassField;

    public ChildrenClass (String parentClassField) {
        super(parentClassField);
    }

    void childrenClassMethod () {
        System.out.println("children class method");
    }
}
