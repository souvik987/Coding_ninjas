package Assighnment;
import java.util.Scanner;
public class Nth_Fibonacci_Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int f1 = 0, f2 = 1, f3;
        for(int i = 1; i<= n; i++){
          f3 = f1 + f2;
          f1 = f2;
          f2 = f3; 
        }
		System.out.print(f1);
    }
}
