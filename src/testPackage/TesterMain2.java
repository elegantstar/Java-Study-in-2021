package testPackage;

import java.util.ArrayList;

public class TesterMain2 {
    public static int getSurvivingIndex(int n, int k) {

        ArrayList<Integer> soldiers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            soldiers.add(i + 1);
        }
        

        while (soldiers.size() != 1) {

            int correction  = 0;
            int count = 0;

            if (soldiers.size() >= k && soldiers.size() % k != 0) {

                correction = soldiers.get((k - (soldiers.size() % k) - 1));

                for (int i = 1; i <= (soldiers.size() / k); i++) {

                    soldiers.remove((i * k) - i);
                }

                System.out.println(soldiers.indexOf(correction) + "번 군사가 죽습니다.");

                for (int i = 0; i < soldiers.indexOf(correction); i++) {
                    soldiers.add(soldiers.get(i));
                    count++;
                }

                for (int i = 0; i < count + 1; i++) {
                    soldiers.remove(0);
                }


            } else if (soldiers.size() >= k && soldiers.size() % k == 0){
                for (int i = 1; i <= (soldiers.size() / k) + 1; i++) {
                    System.out.println(soldiers.get((i * k) - i) + "번 군사가 죽습니다.");
                    soldiers.remove((i * k) - i);
                }

            // 이러한 방식으로는 해결할 수가 없다..
            } else if (soldiers.size() < k) {


            }

        }

        return soldiers.get(0);
    }

    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
    }
}
