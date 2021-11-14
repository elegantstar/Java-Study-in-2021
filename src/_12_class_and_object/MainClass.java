package _12_class_and_object;

public class MainClass {
    public static void main(String[] args) {
        Grandeur myCar1 = new Grandeur();
        myCar1.color = "red";
        myCar1.gear = "auto";
        myCar1.price = 30000000;

        myCar1.run();
        myCar1.stop();
        myCar1.info();

        System.out.println();

        Grandeur myCar2 = new Grandeur();
        myCar2.color = "yellow";
        myCar2.gear = "manual";
        myCar2.price = 27000000;

        myCar2.run();
        myCar2.stop();
        myCar2.info();

        System.out.println();

        Bicycle myBicycle = new Bicycle("red", 100);
        myBicycle.info();

        myBicycle.color = "yellow";
        myBicycle.info();

    }
}
