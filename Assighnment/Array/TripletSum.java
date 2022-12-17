package Assighnment.Array;

import java.util.Scanner;

public class TripletSum {

    public static int tripletSum(int arr[], int x){
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                if(arr[i] + arr[j] + arr[k] == x){
                    sum  += 1;
                }
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
        int result = tripletSum(arr, x);
        System.out.print(result);
    }
}
