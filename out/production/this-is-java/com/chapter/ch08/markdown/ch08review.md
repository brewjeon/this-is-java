# 📖 Chapter 08. Interface

### 8.1 인터페이스 역할

[ 인터페이스 ]<br/>
사전적 의미: 두 장치를 연결하는 접속기<br/>
해석: 서로 다른 객체를 연결하는 역할<br/>
가정: 객체 A는 인터페이스를 통해 객체 B를 사용할 수 있다.

* 객체 A가 인터페이스 Method 호출 시
    * 인터페이스는 객체 B 메서드를 호출하고
    * 그 결과를 받아 객체 A로 전달해준다.
        * 객체 A -> 인터페이스 -> 객체 B 
        * 객체 B -> 인터페이스 -> 객체 A

🤔 객체 A가 객체 B Method 를 직접 호출하지 않고 왜 중간에 인터페이스를 거치도록 하는 걸까?

```
객체 A가 객체 B를 직접 사용한다고 가정하겠다.

이때 객체 B가 객체 C로 변경된다면?
A의 소스 코드를 객체 B에서 -> 객체 C로 변경하는 작업이 필요하다. (직접적 의존성 때문)

만약 객체 A가 인터페이스 메서드를 사용한다면?
객체 B가 객체 C로 변경되어도 상관이 없다.

그러면 당연히 객체 B, 객체 C의 메서드 실행 결과가 다르고,
자연스럽게 객체 A는 객체 교체로 인해 다른 결과를 얻게 된다.

이 특징으로 인터페이스는 다형성을 구현하고,
결합도를 낮추기 위한 구현에 주된 기술로 이용된다.

상속을 이용해서 다형성을 구현할 수도 있지만,
인터페이스를 이용해서 다형성을 구현하는 경우가 더 많다.

인터페이스를 통해 다양한 객체가 동일한 방식으로 통신할 수 있으며,
구체적인 구현에 대한 의존성 없이 서로 상호작용할 수 있다.
이는 유지보수와 확장성을 향상시키는 데 도움이 된다.
```

[ 추상 클래스와 인터페이스 비교 ]
* 추상 클래스
    * 추상 클래스에서 '과일'은 일반적인 특징(색깔, 맛)을 가지고 있다.
    * '과일'은 '사과', '바나나'와 같이 구체적인 하위 클래스를 통해 인스턴스화될 수 있다.
* 인터페이스
    * 인터페이스 '비타민 함유량'은 '과일'이 가져야 하는 다양한 비타민과 무기질을 정의할 수 있다.
    * 이 인터페이스는 어떠한 비타민이나 무기질이 존재해야 하는지 정의할 수 있지만, 그것들이 어떠한 형태로 존재해야 하는지, 어떻게 얻어져야 하는지에 대한 구체적인 사항은 정의하지 않는다.
    *예를 들어 '비타민C 함유량', '비타민A 함유량'등의 메서드를 정의할 수 있다.

```
따라서 추상 클래스 '과일'은 과일의 공통적인 특성과 일부 기본 구현을 제공한다.

인터페이스 '비타민 함유량'은 과일이 가져야 할 추가적인 특성(비타민, 무기질 등)을 정의한다.

하나의 클래스는 상속과 동시에 인터페이스를 구현할 수 있다.
```

### 8.2 인터페이스와 인터페이스 선언 및 메서드 구현
* 인터페이스는 '~.java' 형태의 소스 파일로 작성되고 '~.class' 형태로 컴파일되기 때문에 물리적 형태는 클래스와 동일하다.
* 단, 소스를 작성할 때 선언하는 방법과 구성 멤버가 클래스와 다르다.

[ 인터페이스 선언 ]
* 인터페이스 선언은 class 키워드 대신 interface 키워드를 사용한다.
* 접근 제한자로는 클래스와 마찬가지로 같은 패키지 내에서만 사용 가능한 default, 패키지와 상관 없이 사용하는 public을 붙일 수 있다.

```java
interface 인터페이스명 { ... }        // default 접근
public interface 인터페이스명 { ... } // public 접근 제한

// 인터페이스가 가지는 멤버들을 선언할 수 있는 종류들
public interface 인터페이스명 {
    // public 상수 필드
    // public 추상 메서드
    // public default 메서드
    // public 정적 메서드
    // private 메서드
    // private 정적 메서드
}
```

[인터페이스 메서드 구현]
* 객체 A가 인터페이스의 추상 메서드를 호출하면, 인터페이스를 구현한 객체 B 내의 해당 메서드가 실행된다.
* 따라서 객체 B는 인터페이스에 정의된 추상 메서드와 같은 선언부(재정의된)를 가진 메서드를 가져야 한다.

[ 인터페이스 예제 ]<br/>
Jay와 하리보는 개발을 한다.<br/>
Jay는 프론트엔드 개발자, Ribo는 백엔드 개발자이다.

✍Jay.java

```java
package inteface;

public class Jay extends FrontEnd implements JavaScript, React {
    public Jay() {
    }

    @Override
    public void javaScriptDevelopment() {
        System.out.println("제이가 자스 개발");
    }

    @Override
    public void reactDevelopment() {
        System.out.println("리액트 개발");
    }
}
```

🔍 소스 검토

* Jay 클래스는 FrontEnd 클래스를 상속 받았으며 JavaScript, React 인터페이스를 구현하고 있다.
* JavaScript, React 에 정의된 추상 메서드를 오버라이드 하여 구현해 주어야 자격이 생긴다. 자격이 없으면 오류가 발생한다.(이는 자스, 리액트 언어를 사용하는 자격이 주어지지 않는다는 말이다.)

✍ Ribo.java

```java
package inteface;

public class Ribo extends BackEnd implements Java, Spring, JavaScript {
    public Ribo() {
        super(true);
    }

    @Override
    public void javaDevelopment() {
        System.out.println("자바 개발");
    }

    @Override
    public void springDevelopment() {
        System.out.println("스프링 개발");
    }`

    @Override
    public void javaScriptDevelopment() {
        System.out.println("리보가 자스 개발");
    }
}
```

🔍 소스 검토

* Ribo 클래스는 BackEnd 클래스를 상속 받았으며 Java, Spring, JavaScript 인터페이스를 구현하고 있다.
* Jay 클래스와 같이 추상 메서드를 오버라이드 해줘야 자격이 생긴다.

✍ Main.java

```java
package inteface;

public class Main {
    public static void main(String[] args) {
// 다형성
        Jay jay = new Jay();
        JavaScript js = jay;
        React react = jay;
        Ribo ribo = new Ribo();
// 자바스크립트를 사용하는 클래스들의 배열
        JavaScript[] javaScripts = {
                jay, ribo
        };

// 인터페이스 역시 다형성에 의해 자료형으로 작용 가능
        for (JavaScript javaScript : javaScripts) {
            javaScript.javaScriptDevelopment();
        }
    }
}
```

출력 결과

```
제이가 자스 개발
리보가 자스 개발
```

Tip ! 인터페이스에서 static, default, private 사용 가능한 예제

```java
package inteface;

public interface Java {
    String java = "자바"; // ❌ 초기화 하지 않을 시 오류

    void javaDevelopment();

    static void study() {
        System.out.println("학습 하기");
    }

    default void googling() {
        System.out.println("구글링 하기");
    }

    private String test() {
        return "테스트";
    }
}
```

대충 인터페이스 자체적으로 실행할 수 있다는 말 + implements 구현 클래스 자체적으로 구상하지 않고 객체
로도 실행할 수 있다는 말

```java
package inteface;

public class Main {
    public static void main(String[] args) {
        Java.study();
        Ribo ribo = new Ribo();
        ribo.googling();
    }
}
```

출력 결과

```
학습 하기
구글링 하기
```

🤔 인터페이스에 'default', 'static', private 메서드가 도입된 주된 이유가 뭘까?

* 새로운 메서드를 추가할 때, 구현하는 모든 클래스가 해당 메서드를 정의해야 하는 어려움이 있었다.
  deafult 메서드 도입으로 새로운 메서드를 추가하더라도 기본적인 구현을 제공할 수 있게되었다. 이 접근
  방식은 이전 버전과의 호환성을 보장하므로 인터페이스를 사용하는 기존 클래스를 건들이지 않게 되었
  다.
  ( ex. main 에서 객체.추가된기능() )
* 정적 메서드를 추가하면 인터페이스에서 유틸리티 기능을 직접 제공할 수 있다. 즉, 인터페이스와 관련
  된 도우미 기능이나 작업을 인터페이스 내에서 직접 제공할 수 있으므로 별도의 유틸리티 클래스가 필요
  하지 않다.(ex. MathOperations.add(3, 3))
* default, static 메서드 내에서 중복되는 코드 로직을 private 메서드로 분리함으로써 코드의 재사용성과
  가독성을 향상시킬 수 있게 되었다.
  (ex. 두 개의 분리된 메서드 구현부에 같은 private 메서드를 호출하는 로직)