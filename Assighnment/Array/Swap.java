package Assighnment.Array;

import java.util.Scanner;

public class Swap {
    
    private static int temp;

    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = s.nextInt();
        }
        return arr;
    }
    
    public static void  swapAlternative(int arr[]){
        int size = arr.length;
        for(int i = 0; i < size - 1; i = i + 2){
            int temp;
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        swapAlternative(arr);
        for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
        }
        
        
    }
}
