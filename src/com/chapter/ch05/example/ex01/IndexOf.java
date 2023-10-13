package com.chapter.ch05.example.ex01;

public class IndexOf {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";
        int index = subject.indexOf("프로그래밍");
        int index2 = subject.indexOf("플밍");

        System.out.println(index);
        System.out.println(index2);
    }
}
