package com.chapter.ch05.example.ex01;

public class nullPointerException {
    public static void main(String[] args) {
        int[] intArray = null;
        intArray[0] = 10;   // NullPointerException

        String str = null;
        System.out.println(str.length());   // NullPointerException
    }
}
