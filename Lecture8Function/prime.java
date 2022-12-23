package Lecture8Function;

import java.util.Scanner;

public class prime {
  
    public static boolean isPrime(int n){
        int d= 2;
        while(d < n){
            if(n % d == 0){
                return false;
            }
            d++;
        }
        return true;
    }
  
  
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       boolean ansPrime = isPrime(11);
       System.out.println(ansPrime);
    }
}
