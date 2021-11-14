package _26_exception_handling;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass003 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i, j;
        ArrayList<String> list = null;

        int[] iArr = {0, 1, 2, 3, 4};

        System.out.println("Exception BEFORE");

        try {
            System.out.println("input i : ");
            i = scanner.nextInt();
            System.out.println("input j : ");
            j = scanner.nextInt();

            System.out.println("i / j = " + (i / j));

            for (int k = 0; k < 6; k++) {
                System.out.println("iArr[" + k + "] : " + iArr[k]);
            }

            System.out.println("list.size() : " + list.size());
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {             // 활용 예) 예외 발생과 관계 없이 네트워크를 끊어줘야 하는 경우
            System.out.println("예외 발생 여부에 상관 없이 언제나 실행됩니다.");
        }

        System.out.println("Exception AFTER");
    }
}
