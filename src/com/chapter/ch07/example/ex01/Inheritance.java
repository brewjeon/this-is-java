package com.chapter.ch07.example.ex01;

public class Inheritance {
    public class ParentClass {
        String parentField;

        void parentMethod() {
            System.out.println("parent method");
        }
    }


    public class ChildrenClass extends ParentClass {
        String childrenField;

        void childrenMethod() {
            System.out.println("childrenMethod");
        }
    }

    public void main(String[] args) {   // ⭕ 방법 3
        ChildrenClass childrenClass = new ChildrenClass();
        childrenClass.childrenMethod();
    }
}