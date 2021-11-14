package _28_networking;

public class Networking {
    public static void main(String[] args) {

        /**
         1. 네트워크 데이터 입력 및 출력
            네트워크 대상 (객체) 사이에 입력 및 출력(InputStream, OutputStream)를 이용해서 데이터를 입력하고 출력한다.

         대상A       <----입력(InputStream)----       대상B
         대상A       ----출력(OutputStream)---->    대상B


         2. 소켓(Socket)
            네트워크 상에서 데이터를 주고 받기 위한 장치이다.

         대상A[socket]       <----입력(InputStream)----       [socket]대상B
         대상A[socket]       ----출력(OutputStream)---->    [socket]대상B


         3. Socket Class
            서버는 클라이언트를 맞을 준비를 하고 있다가 클라이언트의 요청에 반응한다.

           클라이언트                                                    서버
         대상A[socket] ------------------------------> [Server Socket]대상B

         서버 IP로 접속할 시, 다양한 서비스를 제공하기 위해 서비스 마다 각각의 포트 번호를 지정하여 사용한다.


         4. Client와 Server 소켓(Socket)
            서버에 ServerSocket을 준비하고 클라이언트에서 Socekt을 이용해서 접속한다.


         5. 양방향 통신
            클라이언트와 서버는 InputStream, OutputStream을 이용해서 양방향 통신을 할 수 있다.
         */

    }
}
