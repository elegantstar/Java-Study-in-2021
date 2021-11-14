package _22_abstract_class;

public class MainClass {
    public static void main(String[] args) {

        AbstractClassEx ex = new ClassEx(10, "java");
        ex.fun1();
        ex.fun2();

        System.out.println("--------------------------");

        Bank myBank = new MyBank("박찬호", "123-4567-89012", 10000);

        myBank.deposit();                               //예금
        myBank.withdraw();                            // 출금
        myBank.installmentSavings();               // 적금
        myBank.cancellation();                        // 해약
        myBank.getInfo();                               // 정보 출력
    }
}
