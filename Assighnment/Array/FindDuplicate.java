package Assighnment.Array;

import java.util.Scanner;

public class FindDuplicate {
public static int duplicateNumbers(int[]arr){
    int n = arr.length;
    for(int i = 0; i < n; i++){
      int duplicate = arr[i];
      for(int j = i + 1; j < n; j++){
        if(duplicate == arr[j]){
            return duplicate;
        }
      }
    }
    return 0;
    }
   


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
       int result =  duplicateNumbers(arr);
         System.out.println(result);
    }
}
