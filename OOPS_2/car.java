package OOPS_2;

public class car extends vehicle {
    int noGear;
    boolean isConvertable;

    public void printCar(){
        System.out.println("Car colour : " + colour);
        System.out.println("Car speed : " + getSpeed());
        System.out.println("Car noGear : " + noGear);
        System.out.println("Car isConvertable : " + isConvertable);
    }
}
