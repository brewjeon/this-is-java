package com.chapter.ch05.example.ex01;

public class referenceType {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int[] arr3;

        arr1 = new int[] {1 ,2, 3};
        arr2 = new int[] {1, 2, 3};
        arr3 = arr2;

        System.out.println(arr1 == arr2);   // false: 같은 주소를 참조하지 않음
        System.out.println(arr2 == arr3);   // true: 같은 주소를 참조함

        String nullTest = null;

        System.out.println(nullTest == null);
    }
}
