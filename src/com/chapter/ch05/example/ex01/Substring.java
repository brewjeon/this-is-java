package com.chapter.ch05.example.ex01;

public class Substring {
    public static void main(String[] args) {
        String ssn = "111111-2222222";
        String firstNum = ssn.substring(0,6);
        String secondNum = ssn.substring(7);

        System.out.println(firstNum);
        System.out.println(secondNum);
    }
}
