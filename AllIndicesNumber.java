package Recursion_1;

import java.util.Scanner;

public class AllIndicesNumber {

public static int[] allindices(int input[], int x){
    return allindices(input, x, 0);
}

private static int[] allindices(int input[], int x, int startIndex){
    if(startIndex == input.length){
        int ans[] = new int[0];
        return ans;
    }
    int smallAns[] = allindices(input, x, startIndex + 1);
    if(input[startIndex] == x){
        int newAns[] = new int[smallAns.length + 1];
        newAns[0] = startIndex;
        for(int i = 0; i < smallAns.length; i++){
            newAns[i + 1] = smallAns[i];
        }
        return newAns;
    }
    else{
        return smallAns;
    }

}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int input[] = new int[size];
        for(int i = 0; i < size; i++){
            input[i] = s.nextInt();
        }
        int x =s.nextInt();
        int output[] = allindices(input, x);
        for(int i = 0; i < output.length; i++){
        System.out.print(output[i] + " ");
        }
    }
}
