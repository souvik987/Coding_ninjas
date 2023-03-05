package OOPS_2;

public class vehicleUse {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.setSpeed(50);
        v.print();

        car c = new car();
        c.noGear = 10;
        c.colour = "Red";
        c.setSpeed(100);
        c.print();;

        c.printCar();
    }
}
