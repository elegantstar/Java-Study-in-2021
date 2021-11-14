package _17_information_hiding;

public class InformationHiding {
    public static void main(String[] args) {

        /**
         1. 멤버 변수의 private 설정
            멤버 변수(속성)는 주로 private으로 설정하여, 외부로부터 데이터가 변질되는 것을 막는다.

                                 [객체]
         Data ---O---> [public 속성]
         Data ---X---> [private 속성]
         */

        /*
        데이터(속성) 변질이 우려되는 시나리오
        - 직원 급여 프로그램에서, 급여 담당자가 실수로 급여액을 잘못 입력하는 경우
        - 변경될 수 없는 사번이 변경되는 경우
         */

        /**
         package com.java.employee;
         public class Employee {
            String name;       <-------
            String no;          <-------    외부에서 쉽게 데이터를 변경할 수 있다.
            int pay;             <-------

            public Employee(String name, String no, int pay) {
                this.name = name;
                this.no = no;
                this.pay = pay;
            }
         }
         */

        /**
         2. setter, getter
            멤버 변수를 외부에서 변경할 수 있도록 하는 메서드이다.
         */

    }
}
