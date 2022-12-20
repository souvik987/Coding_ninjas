package Assighnment;
import java.util.*;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = 1;
        int sqrt = 0;
        for(int i = 0; i < n; i++){
            if( (i * i) > n){
               sqrt = i - 1;
                break;  
            }
        }
        System.out.print(sqrt);
    }
}
