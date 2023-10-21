package com.chapter.ch05.example.ex02;

public class Array {
    public static void main(String[] args) {
        String[] stringArray = {"영", "일", "이", "삼"};
        System.out.println(stringArray[0]); // 읽기: 출력값 '0'

        stringArray[0] = "Zero";
        System.out.println(stringArray[0]); // 수정 후 출력값 'Zero'

        String[] stringArray2 = {"일", "영"};
        // stringArray2 = {"영", "일"};  // ❌(불가능) : 배열 변수를 미리 선언한 후 값 목록을 변수에 대입할 수 없다.
        stringArray2 = new String[] {"영", "일"}; // ⭕(가능) : 값 목록이 대입되는 시점이 다르면 new 타입[] 을 이용하면 대입할 수 있다.
    }
}
