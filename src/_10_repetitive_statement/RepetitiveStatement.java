package _10_repetitive_statement;

import java.util.Scanner;

public class RepetitiveStatement {
    public static void main(String[] args) {
        /**
         1. 반복문이란?
            프로그램을 특정 조건에 따라 반복적으로 실행하는 것.

         for, while문 : 조건이 참일 때까지 반복 수행
         [예1] 구구단을 구하기 위해서 1에서부터 1씩 더하면서 9까지 곱셈 연산을 수행한다.
         [예2] 조도 센서를 센싱한 데이터가 10 미만이면 건물의 LED를 1초 간격으로 계속 점등한다.

        2. for문
            for(int i = 0; i < 10; i++) { ... }

            for ( int i = 1; i < 0; i++)
                i가 1부터 10 보다 작을 때까지 i에  1씩 더해가며 프로그램을 반복 실행

            for ( int i = 1; i < 10; i = i + 2)
                i가 1부터 10 보다 작을 때까지 i에 2씩 더해가며 프로그램 반복 실행
         */

        System.out.println("INPUT NUMER : ");
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();

        for (int i =1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", inputNum, i, (inputNum * i));
        }

        /**
         3. while문
            while(true or false) {...}

            while(rNum < 10)
                rNum이 10 보다 작을 때까지 프로그램 반복 실행
         */

        System.out.println("INPUT NUMBER : ");
        int num = scanner.nextInt();
        int i = 1;
        while (i < 10) {
            System.out.printf("%d * %d = %d\n", num, i, (num * i));
            i++;
        }

        scanner.close();

        System.out.println("-----------------------");

        /**
         4. do ~ while문
            while문과 비슷하며, 차이점은 조건 결과에 상관 없이 무조건 최초 한 번은 {....}의 프로그램을 실행한다.

            do {...} while(rNum < 10)
                rNum이 10 보다 작을 때까지 프로그램 반복 실행. 단, rNum의 조건에 상관 없이 {...}의 프로그램을 1번은 실행한다.
         */

        do {
            System.out.println("무조건 1번은 실행합니다.");
        } while (false);

        System.out.println("-----------------------");

        int j = 10;
        do {
            System.out.println("최초 1번은 무조건 실행");
            j++;
        } while (j < 13);

    }
}
