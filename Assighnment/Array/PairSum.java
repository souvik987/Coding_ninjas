package Assighnment.Array;

import java.util.Scanner;

public class PairSum {
    
    public static int pairSum(int arr[], int x){
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == x){
                    sum  += 1;
                }
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        int x  = s.nextInt();
        int result = pairSum(arr, x);
        System.out.print(result);
    }
}
