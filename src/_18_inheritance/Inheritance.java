package _18_inheritance;

public class Inheritance {
    public static void main(String[] args) {
        /**
         1. 상속이란?
         부모 클래스를 상속 받은 자식 클래스는 부모 클래스의 속성과 기능도 이용할 수 있다.

         할아버지(집)     <---상속---   아버지(집 + 자동차)    <---상속---    아들(집+자동차+요트)

         parent class(속성, 기능)     <---상속---      child class(속성 + 기능)
         child class ---객체 생성---> 객체1(parent class + child class)
         child class ---객체 생성---> 객체2(parent class + child class)


         2. 상속의 필요성
         기존의 검증된 class를 이용해서 빠르고 쉽게 새로운 class를 만들 수 있다.

         G음식점(할아버지 운영)      <--- 모든 메뉴를 새롭게 만들어야  한다.
         ↓비법 계승
         P음식점(아버지 운영)         <--- P음식점의 메뉴는 G음식점의 메뉴에 새로운 몇 가지만 추가하면 된다.
         ↓비법 계승
         C음식점(아들 운영)            <--- C음식점의 메뉴는 P음식점의 메뉴에 새로운 몇 가지만 추가하면 된다.

         ** P음식점, C음식점의 경우 이미 검증된 메뉴를 이용해서 쉽고 빠르게 개업할 수 있다.


         3. 상속 구현
         extend 키워드를 이용해서 상속을 구현한다. (Java 언어에서는 단일상속만 지원함)


         4. 부모 클래스의 private 접근자
         자식 클래스는 부모 클래스의 모든 자원을 사용할 수 있지만, private 접근자의 속성과 메서드는 사용할 수 없다.

         ParentClass       <---상속---       ChildClass 객체 생성
         [public]    <--------O--------   Object1(객체)
         [private]   <--------X--------   Object1(객체)
         */
    }
}
