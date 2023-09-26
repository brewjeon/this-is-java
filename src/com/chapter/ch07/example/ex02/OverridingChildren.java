package com.chapter.ch07.example.ex02;

public class OverridingChildren extends OverridingParent{
    boolean IsAmericaCheck = false;

    @Override
    void hello() {
        if(IsAmericaCheck == true) {
            System.out.println("hello");
        } else {
            super.hello();
        }

    }
}