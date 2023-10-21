package com.chapter.ch05.example.ex02;

public class MethodArray {
    void numberList (int[] numbers) {
        System.out.println(numbers);
    }
    public void main(String[] args) {
        // numberList({1, 2, 3, 4, 5});         // ❌
        numberList(new int[] {1, 2, 3, 4, 5});  // ⭕
    }
}

