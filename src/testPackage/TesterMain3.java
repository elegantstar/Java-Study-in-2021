package testPackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TesterMain3 {
    public static int getSurvivingIndex(int n, int k) {

        Queue<Integer> soldiers = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            soldiers.add(i + 1);
        }

        while (soldiers.size() > 1) {
            for (int i=0; i< k-1; i++) {
                Integer head = soldiers.poll();
                soldiers.add(head);
            }
            // k번째 숫자
            System.out.println(soldiers.poll() + "번 군사가 죽습니다.");
        }

        return soldiers.poll();
    }

    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
    }
}
