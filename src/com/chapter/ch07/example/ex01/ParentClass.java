package com.chapter.ch07.example.ex01;

public class ParentClass {
    String parentClassField = "defaultValue";

    public ParentClass(String parentClassField) {
        this.parentClassField = parentClassField;
    }

    public void parentClassMethod() {
        System.out.println("parent class method : " + parentClassField);
    }
}
