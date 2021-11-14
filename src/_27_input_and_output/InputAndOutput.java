package _27_input_and_output;

public class InputAndOutput {
    public static void main(String[] args) {

     /**
     1. 입출력이란?
        다른 곳의 데이터를 가져오는 것을 입력이라고 하고, 다른 곳으로 데이터를 내보내는 것을 출력이라고 한다.

                       스트림(stream)
     프로그램       ----입력---->       입/출력 대상
     프로그램       <----출력----       입/출력 대상

     입력(Input) 예시 : 파일 읽기, 이미지 & 동영상 불러오기
     출력(output) 예시 : 파일 쓰기, 이미지 & 동영상 내보내기


     2. 입출력 기본 클래스
        입/출력에 사용되는 기본 클래스는 1byte 단위로 데이터를 전송하는 InputStream, OutputStream이 있다.

                         InputStream
     프로그램       ----입력---->       입/출력 대상
     프로그램       <----출력----       입/출력 대상
                        OutputStream

     InputStream : FileInputStream, DataInputStream, BufferedInputStream
     OutputStream : FileOutputStream, DataOutputStream, BufferedOutputStream


     3. FileInputStream / FileOutputStream
        파일에 데이터를 읽고, 쓰기 위한 클래스로 read(), write() 메서드를 이용한다.

     1) FileInputStream (MainClass001)
     read();                                         // 1byte 씩 읽는다.
     read(byte[]);                                 // [] 크기 만큼 씩 읽는다.

     2) FileOutputStream (MainClass002)
     write(byte[] b);                            // 전체 쓰기
     write(byte[], int off, int len);          // off(시작점), len(길이)


     4. 파일 복사
        파일 입/출력 클래스를 이용해서 파일을 복사할 수 있다. (MainClass003)

     FIle1 ---입력---> InputStream & OutputStream ---출력---> File2


     5. DataInputStream, DataOutputStream
        byte 단위의 입출력을 개선해서 문자열을 좀 더 편리하게 다룰 수 있다. (MainClass004 & MainClass005)

     File1 ---입력---> DataInputStream(-> InputStream) & DataOutputStream(-> OutputStream) ---출력---> File2


      6. BufferedReader, BufferedWriter
        byte 단위의 입출력을 개선해서 문자열을 좀 더 편리하게 다룰 수 있다. (MainClass006) - 문자 단위로 읽고 씀

      File1 ---입력---> BufferedReader(-> FileReader) & BufferedWriter(-> FileWriter) ---출력---> File2


     */


    }
}
