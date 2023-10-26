package com.chapter.ch06.example.ex01;

public class ObjectInteraction {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Person person = new Person(shop);
        String IWalk = person.walk("1km");

        System.out.println(IWalk);
    }
}

class Person {
    private Shop shop;

    Person(Shop shop) {
        this.shop = shop;
    }

    String walk(String distance) {
        return shop.rewardForWalking(distance);
    }
}

class Shop {
    String rewardForWalking(String distance) {
        return distance.equals("1km") ? "60kcal" : "";
    }
}