package com.chapter.ch05.example.ex06;

import java.util.Calendar;

public class Today {
    public static void test() {
        System.out.println("hi");
    }

    Today () {
        System.out.println("bye");
        test();
    }

    {
        if(true) {
            test();
        }
    }

    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance();

        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1 :
                today = Week.SUNDAY;

                break;

            case 2 :
                today = Week.MONDAY;

                break;
        }

        System.out.println("오늘은 " + today + "이고 스터디를 하고 있다.");
    }
}
