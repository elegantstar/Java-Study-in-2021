package _21_interface;

public class MainClass {
    public static void main(String[] args) {

        InterfaceA ia = new Interfaceclass();
        InterfaceB ib = new Interfaceclass();

        ia.funA();
        ib.funB();

        System.out.println();

        Toy robot = new ToyRobot();
        Toy airplane = new ToyAirplane();

        Toy toys[] = {robot, airplane};

        for (int i = 0; i < toys.length; i++) {
            toys[i].walk();
            toys[i].run();
            toys[i].alarm();
            toys[i].light();

            System.out.println();
        }
    }
}
