package Assighnment;
import java.util.Scanner;
public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rev = 0, rem;
        while(n != 0){
             rem = n % 10;
             rev = rev * 10 + rem;
            n = n/10;
        }
        System.out.print(rev);
    }
}
