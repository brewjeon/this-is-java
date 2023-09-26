package com.chapter.ch07.example.ex05;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        Animals animals1 = cat;
        Animals animals2 = dog;

        System.out.println(animals1 == cat);
        System.out.println(animals2 == dog);

        Animals animals3 = new Cat();   // ⭕ Dog 도 가능
        //Cat cat1 = new Animals();   // ❌ 컴파일 에러: 상위를 하위에 대입하는 것을 불가능함
        //Cat cat2 = dog;   // ❌ 컴파일 에러: 상속 관계가 아님

        animals1.catMethod();
        animals1.catMethod2();
    }
}
