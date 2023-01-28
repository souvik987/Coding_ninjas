package Oops;

import java.util.Scanner;

public class StudentUse {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    Student s1 = new Student("Souvik", 123);
    s1.print();
   // s1.name = "Souvik";
  // s1.setRollnumber(123);
   // s1.roll_no = 123; 
   // System.out.println(s1.name);
    Student s2 = new Student("Ankush", 1234);
    s2.print();
    System.out.println(Student.getnumStudents());
   // s2.name = "Sayantan";
    //s2.roll_no = 12345;

   // System.out.println(s1.getRollnumber());
}
}
