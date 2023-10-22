package com.chapter.ch05.example.ex05;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] oldIntArray = {1, 2, 3};
        int[] newIntArray = new int[5];

        for(int i =0; i < oldIntArray.length; i ++) {
            newIntArray[i] = (oldIntArray[i]);
        }

        for (int value : newIntArray) {
            System.out.println(value);
        }

        int[] oldIntArray2 = {1, 2, 3};
        int[] newIntArray2 = new int[5];

        System.arraycopy(oldIntArray2, 0 , newIntArray2, 0, oldIntArray2.length);

        for (int value2 : newIntArray) {
            System.out.println("==========");
            System.out.println(value2);
        }
    }
}
