package _27_input_and_output;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainClass008 {
    public static void main(String[] args) {

        // 매번 close를 실행하는 코드를 짜다 보면 코드가 지저분해지고, 깜빡 잊는 경우가 많아 자동으로 close가 되도록 하는 기능을 고안함.
        // try ( )를 사용하여 InputStream이 try 내부에서만 동작하고, try 밖으로 벗어나면 자동으로 닫히도록 설계되어 있기 때문에 코드도 보다 깔끔하면서, close 까지 확실하게 할 수 있다.
       try (InputStream inputStream1 = new FileInputStream("D:\\YM\\java-study\\src\\_27_input_and_output\\hello.txt");) {
            int data1 = 0;
            while (true) {
                try {
                    data1 = inputStream1.read();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(data1 == -1) break;
                System.out.println("data : " + data1);
            }
        } catch (Exception e) {
            //ignored
        }
    }
}
