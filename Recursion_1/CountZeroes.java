
package Recursion_1;

import java.util.Scanner;

public class CountZeroes {

public static int countzeroes(int n){
    if(n < 10){
        if(n == 0){
            return 1;
        }
        else{
            return 0;
        }
    }

    int ans = countzeroes(n / 10);
    if(n % 10 == 0){
        ans = ans + 1;
    } 
    return ans;
}

    public static void main(String[] args) {
    System.out.println(countzeroes(1030450890));

    }
}
