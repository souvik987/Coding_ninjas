package Array;

import java.util.Scanner;

public class ArrayUSe {

    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
       int size = s.nextInt();
       int input[] = new int[size];
       for(int i = 0; i < size; i++){
        input[i] = s.nextInt();
       }
       return input;
    }

    public static void print(int input[]){
        int size = input.length;
        for(int i = 0; i < size; i++){
            System.out.print(input[i] + " ");
           }
            
           System.out.println();
    
    }

    public static void main(String[] args) {
       
     int arr[] = takeInput();
     print(arr);

    }
}
