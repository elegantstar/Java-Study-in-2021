package testPackage;

import java.util.Scanner;

public class TesterMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String selectMenu1;
        String selectMenu2;

        do {
            System.out.println("(I)ntro (C)ources (E)xit");
            selectMenu1 = scanner.next();
            // scaner.next().toLowerCase() 사용하면 어떤 값이 입력되든 소문자로 변환.

            switch (selectMenu1) {
                case "e":
                case "E":
                    System.out.println("안녕히 가세요.");
                    break;

                case "i":
                case "I":
                    System.out.println("안녕하세요!  우리는 코드잇입니다.\n함께 공부합시다!");
                    break;

                case "c":
                case "C":

                    do {
                        System.out.println("코드잇 수업을 소개합니다.\n(P)ython (J)ava (i)OS (B)ack");
                        selectMenu2 = scanner.next();

                        switch (selectMenu2) {
                            case "p":
                            case "P":
                                System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.\n강사: 강영훈\n추천 선수과목: 없음");
                                break;

                            case "j":
                            case "J":
                                System.out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.\n강사: 김신의\n추천 선수과목: Python");
                                break;

                            case "i":
                            case "I":
                                System.out.println(
                                        "최신 Swift 언어를 통해 iOS 개발을 시작할 수 있습니다.\n강사: 성태호\n추천 선수과목: Python, Java");

                            case "b":
                            case "B":
                                break;
                        }
                    } while (!selectMenu2.equalsIgnoreCase("b")) ;
            }

        } while (!(selectMenu1.equalsIgnoreCase("e")));
    }
}

