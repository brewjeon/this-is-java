package com.chapter.ch05.example.ex03;

public class TwoDArray {
    // 2차원 배열 생성
    static int[][] scores = {{10, 20, 30}, {90, 100}};  // 타입[][] 변수 = new 타입[1차원수][2차원수]

    public static int getScores() {
        return scores[0][0];
    }

    public static void main(String[] args) {
        System.out.println(getScores());    // 출력값 : 10
    }
}
