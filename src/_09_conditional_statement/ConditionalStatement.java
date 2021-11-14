package _09_conditional_statement;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        /**
         1. 조건문
            조건의 결과에 따라서 양자택일 또는 다자택일을 진행한다.

            - 양자택일(주로 if문이 쓰임)
            - 다자택일(주로 switch문이 쓰임)

         2. if문
         if(조건식), if(조건식) else, if(조건식) else if(조건식)
         */

        int num1 = 10;
        int num2 = 20;

        // if(조건식)
        if(num1 < num2) {
            System.out.println("num1은 num2 보다 작다.");
        }

        System.out.println();

        // if(조건식) else
        if(num1 < num2) {
            System.out.println("num1은 num2 보다 작다.");
        } else {
            System.out.println("num1은 num2 보다 크거나 같다.");
        }

        System.out.println();

        // if(조건식) else if(조건식)
        if(num1 < num2) {
            System.out.println("num1은 num2 보다 작다.");
        } else if(num1 > num2) {
            System.out.println("num1은 num2 보다 크다.");
        } else {
            System.out.println("num1은 num2와 같다.");
        }

        if(true) {
            System.out.println("==============");
        }
        if (false) {
            System.out.println("++++++++++++++");
        }

        /**
         3. switch문
            비교대상이 되는 결과값과 선택사항이 많을 경우 주로 사용한다.
         */

        // switch문
        System.out.println("점수를 입력하세요. : ");
        Scanner inputNum = new Scanner(System.in);
        int score = inputNum.nextInt();

        switch (score) {
            case 100:   // 100일 때와 90일 때 모두 동일한 동작을 실행 해야  하는 경우, case문을 두 번 써서 조건식을 만들 수 있다.
            case 90:
                System.out.println("수");
                break;

            case 80:
                System.out.println("우");
                break;

            case 70:
                System.out.println("미");
                break;

            default:
                System.out.println("try again!!");
                break;
        }

        inputNum.close();
    }
}
