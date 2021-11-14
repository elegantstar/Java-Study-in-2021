package _19_inheritance_feature;

import com.sun.xml.internal.fastinfoset.util.PrefixArray;

import sun.plugin2.util.ParameterNames;

public class MainClass {
    public static void main(String[] args) {

        FirstChildClass ch1 = new FirstChildClass();
        SecondChildClass ch2 = new SecondChildClass();

        System.out.println();

        ParentClass[] pArr = new ParentClass[2];

        ParentClass fch = new FirstChildClass();
        ParentClass sch = new SecondChildClass();

        pArr[0] = fch;      // <-- 상속 받고 있기 때문에 클래스가 달라도 배열에 입력 가능하다.
        pArr[1] = sch;

        System.out.println();

        FirstChildClass c = new FirstChildClass();
        c.getOpenYear();
    }
}
