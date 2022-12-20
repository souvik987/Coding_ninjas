package Assighnment;

import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j == i){
                    System.out.print("*");
                }
                else{
                    System.out.print("0");
                }
               // j--;
                //System.out.print("*");
            }
        }
    }
}
