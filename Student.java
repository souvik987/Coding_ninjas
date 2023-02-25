package Oops;

public class Student {
    String name;
    private final int rollNumber;
    private static int numStudents;

   /*  public Student(String n){
        name = n;
    }*/

    public static int getnumStudents(){
        return numStudents;
    }

    public Student(String name, int rollNumber){
       this.name = name;
       this. rollNumber = rollNumber;
       numStudents++;
    }

    /*public void setRollnumber(int rn){
        if(rn <= 0){
            return;
        }
        rollNumber = rn;
    }*/

    public int getRollnumber(){
        return rollNumber;
    }

    public void print(){
        System.out.println(name + " : " + rollNumber);
    }
}
