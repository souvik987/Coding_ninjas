package Assighnment;
import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long ans = 0, pv = 1, rem;
        while(n != 0){
            rem = n % 2;
            ans = ans + (rem * pv);
            n = n / 2;
            pv = pv * 10;
        }
      System.out.print(ans);
    }
}
