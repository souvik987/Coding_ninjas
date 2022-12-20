package Assighnment;
import java.util.Scanner;
public class SumOfProduct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = s.nextInt();
       	if(c == 1){
            int sum = 0;
            for(int i = 1; i <= n; i++){
                sum = sum + i;
            }
              System.out.print(sum);
        }
        else if( c == 2){
            int product = 1;
            for(int k = 1; k <= n; k++){
                product *= k;
            }
            System.out.print(product);
            
        }
        else{
            System.out.print(-1);
        }
    }
}
