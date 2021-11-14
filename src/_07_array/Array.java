package _07_array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        /**
         1. 배열이란?
         인덱스를 이용하여 자료형이 같은 데이터를 관리 하는 것

         <배열 사용의 예>
         - 아파트 호수 관리 : 101호, 201호, 301호, 401호, 501호
         - 회사 사번 관리 : 홍길동(k-0001), 홍길자(k-0002), 홍길순(k-0003), … 홍길똥(k-0007)
         - 학급 학생 관리 : 박찬호(01), 이승엽(02), 박용택(03), … 홍성흔(06)

        2. 배열 선언 및 초기화
         배열도 변수와 마찬 가지로 선언과 초기화 과정을 거쳐 사용한다.
         */

        // 배열 선언 후 초기화
        int[] arr1 = new int[5];
        arr1[0] = 100;
        arr1[1] = 200;
        arr1[2] = 300;
        arr1[3] = 400;
        arr1[4] = 500;

        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr1[1] : " + arr1[1]);
        System.out.println("arr1[2] : " + arr1[2]);
        System.out.println("arr1[3] : " + arr1[3]);
        System.out.println("arr1[4] : " + arr1[4]);

        System.out.println("-----------------------");

        // 배열 선언과 초기화를 동시에
        int[] arr2 = {10, 20, 30, 40, 50};
        System.out.println("arr2[0] : " + arr2[0]);
        System.out.println("arr2[1] : " + arr2[1]);
        System.out.println("arr2[2] : " + arr2[2]);
        System.out.println("arr2[3] : " + arr2[3]);
        System.out.println("arr2[4] : " + arr2[4]);

        /**
         3. 배열을 이용한 학사 관리
         배열은 주로 많은 데이터를 쉽게(효율적으로) 관리하기 위해서 사용한다.
         */

        String[] name = {"박찬호", "이승엽", "박병호", "이병규", "류현진"};
        int[] score = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s의 점수를 입력하시오. : ", name[0]);
        score[0] = scanner.nextInt();

        System.out.printf("%s의 점수를 입력하시오. : ", name[1]);
        score[1] = scanner.nextInt();

        System.out.printf("%s의 점수를 입력하시오. : ", name[2]);
        score[2] = scanner.nextInt();

        System.out.printf("%s의 점수를 입력하시오. : ", name[3]);
        score[3] = scanner.nextInt();

        System.out.printf("%s의 점수를 입력하시오. : ", name[4]);
        score[4] = scanner.nextInt();

        System.out.printf("%s 점수 : \t%.2f\n", name[0], (double)score[0]);
        System.out.printf("%s 점수 : \t%.2f\n", name[1], (double)score[1]);
        System.out.printf("%s 점수 : \t%.2f\n", name[2], (double)score[2]);
        System.out.printf("%s 점수 : \t%.2f\n", name[3], (double)score[3]);
        System.out.printf("%s 점수 : \t%.2f\n", name[4], (double)score[4]);

        double ave = (double)(score[0] + score[1] + score[2] + score[3] + score[4]) / 5;
        System.out.printf("-------------------------\n평  점 : \t%.2f", ave);

        scanner.close();

    }
}
