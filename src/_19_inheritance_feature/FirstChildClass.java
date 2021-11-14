package _19_inheritance_feature;

public class FirstChildClass extends ParentClass {
    public FirstChildClass() {
        System.out.println("FirstChildClass constructor");
    }

    int openYear = 2000;

    public void getOpenYear() {
        System.out.println("ChildClass's Open year : " + this.openYear);
        System.out.println("ChildClass's Open year : " + super.openYear);
    }

    @Override
    public void makeJJajang() {
        System.out.println("-- FirstChildClass's makeJJajang() --");
    }
}
