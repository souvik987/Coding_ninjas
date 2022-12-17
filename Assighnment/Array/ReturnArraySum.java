package Assighnment.Array;
import java.util.*;
public class ReturnArraySum {
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int size = s.nextInt();
        int input[] = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }

        return input;
    }
    
	public static int sum(int[] input) {
		//Your code goes here
        int sum = 0;
        int size = input.length;
        for(int i = 0; i < size; i++){
            sum  = sum + input[i];
        }
       return sum; 
	}
    
    public static void main(String[] args){
        int arr[] = takeInput();
        int SUM = sum(arr);
        System.out.print(SUM);
    }
}
