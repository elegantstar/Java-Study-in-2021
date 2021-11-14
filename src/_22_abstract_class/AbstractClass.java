package _22_abstract_class;

public class AbstractClass {
    public static void main(String[] args) {

    /**
     1. 추상클래스란?
        클래스의 공통된 부분을 뽑아서 별도의 클래스(추상클래스)로 만들어 놓고, 이것을 상속해서 사용한다.

     abstract class     <----상속----     class     ----생성---->     Object

     abstract class의 특징
     1) 멤버변수를 가진다.
     2) abstract class를 상속하기 위해서는 extends를 이용한다.
     3) abstract method를 가지며, 상속한 클래스에서 반드시 구현해야 한다.
     4) 일반 메서드도 가질 수 있다.
     5) 일반 클래스와 마찬가지로 생성자도 있다.


     2. 추상 클래스 구현
        클래스 상속과 마찬가지로 extends 키워드를 이용해서 상속하고 abstract(추상) 메서드를 구현한다.


     3. 인터페이스 vs 추상클래스
        1) 공통점
            : 추상 매서드를 가진다..
             객체 생성이 불가하며 자료형(타입)으로 사용된다.

        2) 차이점
            인터페이스 : 상수, 추상메서드만 가진다.
                             추상 메서드를 구현만 하도록 한다.
                             다형성을 지원한다.

            추상클래스 : 클래스가 가지는 모든 속성과 기능을 가진다.
                             추상 메서드 구현 및 상속의 기능을 가진다.
                             단일 상속만 지원한다.
    */
    }
}
