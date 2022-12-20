package Assighnment.Array;

import java.util.Scanner;

public class Intersection {

    public static void intersection(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr1[] = new int[n];
        for(int  i= 0; i < n; i++){
            arr1[i] = s.nextInt();
        }
       int m = s.nextInt();
       int arr2[] = new int[m];
       for(int j = 0; j < m; j++){
        arr2[j] = s.nextInt(); 
       } 
       intersection(arr1, arr2);
    }
}
