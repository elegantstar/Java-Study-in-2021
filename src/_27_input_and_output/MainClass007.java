package _27_input_and_output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass007 {
    public static void main(String[] args) {

        String fileName = "D:\\YM\\java-study\\src\\_27_input_and_output\\helloWriter.txt";

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            String str = "Hello java World~~\n";
            str += "Hello C World~~\n";
            str += "Hello C++ World~~\n";

            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            bw.write(str);

            System.out.println("end");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) bw.close();
                if (fw != null) fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
