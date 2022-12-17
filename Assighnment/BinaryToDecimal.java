package Assighnment;
import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = 0, pv = 1, rem;
        while(n != 0){
            rem = n % 10;
            ans = ans + (pv * rem);
            n = n/10;
            pv = pv * 2;
        }
        System.out.print(ans);
    }
}
