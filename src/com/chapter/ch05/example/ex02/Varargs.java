package com.chapter.ch05.example.ex02;

public class Varargs {
    static int sum(int... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = sum(1, 14);
        System.out.println(result);
    }
}