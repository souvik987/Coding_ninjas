package Assighnment;
import java.util.*;
public class CheckNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p = s.nextInt();
        boolean isDec = true;
        int i = 1, c;
        while(i <= n - 1){
           c = s.nextInt();
        if(c == p){
            System.out.print("false");
            System.exit(0);
        }
       else if(c < p){
            if(isDec == false){
                System.out.print("false");
               System.exit(0);
            }
        }
        else {
            if(isDec == true){
                isDec = false;
            }
        }
        p = c;
        i++;
       
        }
       System.out.print("true"); 
        
    }
}
