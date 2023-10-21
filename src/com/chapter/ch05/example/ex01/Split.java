package com.chapter.ch05.example.ex01;

public class Split {
    public static void main(String[] args) {
        String board = "번호, 제목, 내용, 성명";
        String[] arr = board.split(", ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " index value : " + arr[i]);
            // 0 index value : 번호
            // 1 index value : 제목
            // 2 index value : 내용
            // 3 index value : 성명
        }
    }
}
