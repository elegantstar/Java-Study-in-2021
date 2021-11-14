package _26_exception_handling;

public class ExceptionHandling {
    public static void main(String[] args) {

        /**
         1. 예외란?
         프로그램에 문제가 있는 것을 말하며, 예외로 인해 시스템 동작이 멈추는 것을 막는 것을 '예외 처리"라고 한다.

         Exception vs Error : Exception은 개발자가 대처할 수 있고, Error는 개발자가 대처할 수 없음.
         1) Checked Exception : '예외 처리'를 반드시 해야 하는 경우(네트워크, 파일 시스템 등)
         2) Unchecked Exception : '예외 처리'를 개발자의 판단에 맡기는 경우(데이터 오류 등)


         2. Exception 클래스
         Exception 클래스 하위 클래스로 NullPointerException, NumberFormatException 등이 있다.

         Exception
         1) NullPointerException : 객체를 가리키지 않고 있는 레퍼런스를 이용할 때
         2) ArrayIndexOutOfBoundException : 배열에서 존재하지 않는 인덱스를 가리킬 때
         3) NumberFormatException : 숫자 데이터에 문자 데이터 등을 넣었을 때


         3. try ~ catch
         개발자가 예외 처리하기 가장 쉽고, 많이 사용하는 방법이다.

         try  {
         예외가 발생할 수 있는 코드
         } catch (Exception e) {
         예외가 발생했을 때 처리할 코드
         }


         4. 다양한 예외 처리
         Exception 및 하위 클래스를 이용해서 예외 처리를 다양하게 할 수 있다.


         5. finally
         예외 발생 여부와 관계 없이 반드시 실행된다.


         6. throws
         예외 발생 시 예외 처리를 직접 하지 않고 호출한 곳으로 넘긴다.
         */
    }
}
