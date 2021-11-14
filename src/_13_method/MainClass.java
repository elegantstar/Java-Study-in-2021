package _13_method;

public class MainClass {
    public static void main(String[] args) {

        ChildClass child1 = new ChildClass( );
        child1.name = "hong gil dong";
        child1.gender = "M";
        child1.age = 20;

        child1.getInfo( );

        System.out.println();

        ChildClass child2 = new ChildClass( );
        child2.setInfo("hong gil dong", "M", 20);

        child2.getInfo( );

    }
}
