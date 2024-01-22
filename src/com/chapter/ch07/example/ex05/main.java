package com.chapter.ch07.example.ex05;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        Animals animals1 = cat;
        Animals animals2 = dog;

        animals1.method();
        animals2.method();
    }
}
