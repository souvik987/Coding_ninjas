package OOPS_2;

public class vehicle {
    String colour;
    private int maxSpeed;

    public int getSpeed(){
        return maxSpeed;
    }

    public void setSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public void print(){
        System.out.println("Vehicle colour : " + colour);
        System.out.println("Vehicle speed : " + maxSpeed);
    }
}
