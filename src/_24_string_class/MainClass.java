package _24_string_class;

public class MainClass {
    public static void main(String[] args) {

        // String str = "JAVA";
        String str = new String("JAVA");
        System.out.println("str : " + str);

        str = str + "_8";
        System.out.println("str : " + str);

        // StringBuffer
        StringBuffer sf = new StringBuffer("JAVA");
        System.out.println("sf : " + sf);
        sf.append(" World");
        System.out.println("sf : " + sf);
        System.out.println("sf.length() : " + sf.length());
        sf.insert(sf.length(), "~~~~");     // 추가할 위치, 추가할 문자열
        System.out.println("sf : " + sf);

        sf.delete(4, 8);                                // 삭제 구간(4와 8 사이)
        System.out.println("sf : " + sf);

        StringBuilder sb = new StringBuilder("JAVA world");
        System.out.println("sb : " + sb);

    }
}
