package Assighnment.Array;

import java.util.Scanner;

public class FindUnique {

    public static int findUnique(int[] arr){
		//Your code goes here
        int n = arr.length;
        int k = 0;
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++){
            int x  = arr[i];
            if(visited[i] == false){
                boolean isDuplicate = false;
            for(int j = i + 1; j < n; j++){
               if(x == arr[j]){
                   isDuplicate = true;
                   visited[j] = true;
               }
            }
            
            if(!isDuplicate){
                k = x;
            }
         }
        }
        return k;
    }

      

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int  i= 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        int result = findUnique(arr);
        System.out.print(result);

    }
}
