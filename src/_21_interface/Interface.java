package _21_interface;

public class Interface {
    public static void main(String[] args) {
        /**
         1. 인터페이스란?
            클래스와 달리 객체를 생성할 수는 없으며, 클래스에서 구현해야 하는 작업 명세서이다.

            [class] ---생성---> [Object]
            [interface] ---생성X---> [Object]
                ↑ 구현
            [class] ---생성---> [Object]


         2. 인터페이스를 사용하는 이유
            인터페이스를 사용하는 이유는 많지만, 가장 큰 이유는 객체가 다양한 자료형(타입)을 가질 수 있기 때문이다.

                    ---> interfaceA
                    ---> interfaceB
            class
                    ---> interfaceC
                    ---> interfaceD

         3. 인터페이스 구현
            class 대신 interface 키워드를 사용하며, extend 대신 implements 키워드를 이용한다.


         4. 장난감 인터페이스
            interface를 이용하면 객체가 다양한 자료형(타입)을 가질 수 있다.

         Toy <--- ToyRobot, ToyAirplane

         Toy robot = new ToyRobot();
         Toy airplane = new ToyAirplane();

         Toy toys[] = {robot, airplane};

         for (int i = 0; i < toys.length; i++) {
            toys[i].walk();
            toys[i].run();
            toys[i].alarm();
            toys[i].light();

            System.out.println();
         }


         */
    }
}
