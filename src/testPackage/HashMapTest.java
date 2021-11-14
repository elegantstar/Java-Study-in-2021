package testPackage;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Human human = new Human("영재", 17);
        Human human2 = new Human("영재", 18);
        System.out.println(human.equals(human2));
        System.out.println(human.hashCode() + " " + human2.hashCode());

        Map<Human, String> map = new HashMap<>();
        map.put(human, "String1");      //map : 1622506 --> String1
        map.put(human2, "String2");     //map : 1622506 --> String2

        // put
        // 1) 해시코드가 있는지확인
        // 2) 없다면 바로 삽입
        // 3) 있다면 equals로 비교. 같다면 덮어쓰기
        // 4) 다르다면 삽입

        
        for (Human h : map.keySet()) {
            System.out.println(h.toString());
        }

    }
}
