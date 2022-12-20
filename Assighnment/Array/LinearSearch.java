package Assighnment.Array;

import java.util.Scanner;

public class LinearSearch {
    
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int input[] = new int[size];
        for(int  i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        int x = s.nextInt();
        return input;
    }
    
    public static int linearSearch(int input[], int x){
        int size = input.length;
       for(int i = 0; i < size; i++){
        if(input[i] == x){
            return i;
        }
       }
      return -1; 
    }

     public static void main(String[] args, int x) {
        int arr[]  = takeInput();
        int result = linearSearch(arr, x);
        System.out.print(result);
    }
}
