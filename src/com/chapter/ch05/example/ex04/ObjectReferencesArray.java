package com.chapter.ch05.example.ex04;

public class ObjectReferencesArray {
    public static void main(String[] args) {
        String[] strArray = new String[5];  // 5번지
        strArray[0] = "A";  // 10번지
        strArray[1] = "B";  // 20번지
        strArray[2] = "C";  // 30번지
        strArray[3] = "C";  // 30번지
        strArray[4] = new String("C");  // 40번지
    }
}
