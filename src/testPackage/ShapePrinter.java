package testPackage;

public class ShapePrinter {
        public void printFloydsPyramid(int height) {
            int maxNum = (height * (height + 1)) / 2;
            int maxDigit = (int) Math.log10(maxNum) + 1;

            // 0 1 3 6 10
            int currentNum = 0;
            for (int i = 1; i < height + 1; i++) {
                for (int j = 1; j < i + 1; j++) {
                    //int currentNum = (i*(i-1)/2) + j; i, j에 종속 되는 식으로 짤 필요 없음.
                    currentNum++;

                    System.out.print(String.format("% 3d", currentNum));

                }

                System.out.println();
            }
        }

}
