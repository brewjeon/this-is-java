# Chapter 09. 중첩 선언과 익명 객체

### 1. 중첩 클래스
* 객체 지향 프로그램에서는 클래스 간에 긴밀한 관계를 맺고 상호작용한다.

* 클래스가 여러 클래스와 관계를 맺는 경우에는 독립적으로 선언하는 것이 좋으나, 특정 클래스만 관계를 맺을 경우에는 중첩 클래스로 선언하는 것이 유지보수에 도움이 되는 경우가 많다.

* 중첩클래스란?
    * 클래스 내부에 선언한 클래스를 말한다.
    * 중첩 클래스를 사용하면 클래스의 멤버를 쉽게 사용할 수 있고 외부에는 중첩 관계 클래스를 감춤으로써 코드의 복잡성을 줄일 수 있다는 장점이 있다.    
* 중첩 클래스를 선언하는 위치에 따라 두 가지로 분류된다.
    * 클래스의 멤버로서 선언되는 중첩 클래스를 멤버 클래스라 하고,
    * 메서드 내부에서 선언되는 중첩 클래스를 로컬 클래스라고 한다.

[ 멤버 클래스 ]

1. 인스턴스 멤버 클래스
    ```java
    // A 클래스를 생성해야만 B 클래스를 생성할 수 있음
    class A {
        class B {
        }
    }
    ```

2. 정적 멤버 클래스
    ```java
    // A 객체를 생성하지 않아도 B 객체를 생성할 수 있음
    class A {
        static class B {
        }
    }
    ```

[ 로컬 클래스 ]


```java
// method가 실행할 때만 B 객체를 생성할 수 있음
class A {
    void method() {
        class B {
        }
    }
}
```

* 중첩 클래스도 하나의 클래스이기 때문에 컴파일하면 바이트코드 파일 (.class)이 별도로 생성된다.

1. 멤버 클래스일 경우 바이트코드 파일의 이름은 다음과 같이 결정된다.
    ```
                A $ B .class
    => 바깥 클래스 $ 멤버 클래스 .class
    ```
2. 로컬 클래스일 경우에는 다음과 같이 $1이 포함된 바이트코드 파일이 생성된다.
    ```
                A $1 B .class
    => 바깥 클래스 $1 로컬 클래스 .class
    ```

### 2. 인스턴스 멤버 클래스
* 인스턴스 멤버 클래스는 다음과 같이 A 클래스의 멤버로 선언된 B 클래스를 말한다.
```java
[public] class A {
    [public | private] class B {   // 인스턴스 멤버 클래스
        // public class B {}: 다른 패키지에서 B 클래스 사용 가능
        // class B {}: 같은 패키지에서만 B 클래스 사용 가능
        // private class B {}: A 클래스 내부에서만 B 클래스를 사용 가능 
    }
}
```

* 인스턴스 멤버 클래스 B는 주로 A 클래스 내부에서 사용되므로 private 접근 제한을 갖는 것이 일반적이다.
* B 객체는 A 클래스 내부 어디에서나 생성할 수 없고, 인스턴스 필드값, 생성자, 인스턴스 메서드에서 생성할 수 있다.
* A 객체가 있어야 B 객체도 생성하 수 있기 때문이다.

✍ A.java (ex01)
```java
package com.chapter.ch09.example.sec02.ex01;

public class A {
    // 인스턴스 멤버 클래스
    class B {}

    // 인스턴스 필드 값으로 B 객체 대입
    B filed = new B();

    // 생성자
    A() {
        B b = new B();
    }

    // 인스턴스 메서드
    void method() {
        B b = new B();
    }
}
```

✍ AExample.java (ex01)
```java
package com.chapter.ch09.example.sec02.ex01;

public class AExample {
    public static void main(String[] args) {
        // A 객체 생성
        A a = new A();

        // B 객체 생성
        A.B b = a.new B();
    }
}
```
[ ex01 예제 설명 ]
* B 객체를 A 클래스 외부에 생성하려면 default 또는 public 접근 제한을 가져야 하고, A 객체를 먼저 생성한 다음 B 객체를 생성해야 한다.


✍ A.java (ex02)
```java
package com.chapter.ch09.example.sec02.ex02;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class A {
    // 인스턴스 멤버 클래스
    class B {
        // 인스턴스 필드
        int field1 = 1;
        
        // 정적 필드(Java 17부터 허용)
        static int field2 = 2;
        
        // 생성자
        B() {
            System.out.println("B-생성자 실행");
        }
        
        // 인스턴스 메서드
        void method1() {
            System.out.println("B-method1 실행");
        }
        
        // 정적 메서드(Java 17부터 허용)
        static void method2() {
            System.out.println("B-method2 실행");
        }

    }
    // 인스턴스 메서드
    void useB() {
        // B 객체 생성 및 인스턴스 필드 및 메서드 사용
        B b = new B();
        System.out.println(B.field2);
        b.method1();

        // B 클래스의 정적 필드 및 메서드 사용
        System.out.println(B.field2);
        B.method2();
    }
}
```

✍ AExample.java (ex02)
```java
package com.chapter.ch09.example.sec02.ex02;

public class AExample {
    public static void main(String[] args) {
        // A 객체 생성
        A a = new A();

        // A 인스턴스 메서드 호출
        a.useB();
    }
}
```

[ ex02 예제 설명 ]
* 인스턴스 멤버 클래스 B 내부에는 일반 클래스와 같이 필드, 생성자, 메서드 선언이 올 수 있다.
* 정적 필드와 정적 메서드는 Java 17부터 선언이 가능하다.

### 3. 정적 멤버 클래스

* 정적 멤버 클래스는 다음과 같이 static 키워드와 함께 A 클래스의 멤버로 선언된 B 클래스를 말한다.

```java
[public] class A {
    // 정적 멤버 클래스
    [public | private] static class B {
        // public static class B {}: 다른 패키지에서 B 클래스 사용 가능
        // static class B {}: 같은 패키지에서만 B 클래스 사용 가능
        // private static class B {}: A 클래스 내부에서만 B 클래스를 사용 가능 
    }
}
```

* 정적 멤버 클래스 B는 A 클래스 내부에서 사용되기도 하지만, A 클래스 외부에서 A와 함께 사용되는 경우가 많기 때문에 주로 default 또는 public 접근 제한을 가진다.
* B 객체는 A 클래스 내부 어디든 객체를 생성할 수 있다.


✍ A.java (ex03)
```java
package com.chapter.ch09.example.sec03;

public class A {
    // 인스턴스 멤버 클래스
    static class B {
    }

    // 인스턴스 필드 값으로 B 객체 대입
    B field1 = new B();

    // 정적 필드 값으로 B 객체 대입
    static B filed2 = new B();

    // 생성자
    A() {
        B b = new B();
    }

    // 인스턴스 메서드
    void method1() {
        B b = new B();
    }

    // 정적 메서드
    static void method2() {
        B b = new B();
    }
}
```

✍ AExample.java (ex03)

```java
package com.chapter.ch09.example.sec03;

import com.chapter.ch09.example.sec03.ex01.A;

public class AExample {
    // B 객체 생성
    A.B b = new A.B();
}
```
[ ex04 예제 설명 ]


[ ex04 예제 설명 ]
* 정적 멤버 클래스 B 내부에는 일반 클래스와 같이 필드, 생성자, 메서드 선언이 올 수 있다.

