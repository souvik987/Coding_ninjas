package Recursion_1;

import javax.swing.text.html.StyleSheet;

public class First_index_Number {


    public static int firstIndex(int input[], int x){
        return firstIndex(input, x, 0);
    }

    private static int firstIndex(int input[], int startIndex, int x){
        if(startIndex == input.length){
            return -1;
        }

        if(input[startIndex] == x){
            return startIndex;
        }

        int smallans = firstIndex(input, startIndex + 1, x);
        return smallans;

    }

    public static void main(String[] args) {
        int input[] = {4, 6, 7, 9, 10, 11, 9,};
        System.out.print(firstIndex(input, 0, 9));

    }
}
