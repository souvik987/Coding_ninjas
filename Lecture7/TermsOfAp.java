package Lecture7;
import java.util.Scanner;
public class TermsOfAp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++){
            int terms =  (3 * i) + 2;
            if(terms % 4 == 0){
                n++;
                continue;
            }
        	System.out.print(terms + " ");
        }
    }
}
