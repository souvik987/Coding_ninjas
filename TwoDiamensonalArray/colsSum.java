package TwoDiamensonalArray;

import java.util.Scanner;

public class colsSum {

    public static int[][] takeinput(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int rows = s.nextInt();
        System.out.print("Enter the no. of cols: ");
        int cols = s.nextInt();
        int input[][] = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.println("Enter element at "+i+" rows "+j+" coloums");
                 input[i][j] = s.nextInt();
            }
        }
        return input;
    }

    public static void print(int[][]input){
        int rows = input.length;
        int cols = input[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int largestColoumsSum(int[][]input){
        int largest = Integer.MIN_VALUE;
        for(int j = 0; j < input[0].length; j++){
            int sum = 0;
            for(int i = 0; i < input.length; i++){
                sum = sum + input[i][j];
            }
            if(sum > largest){
                largest = sum;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int input[][] = takeinput();
        print(input);
        System.out.println("Largest cols sum: " + largestColoumsSum(input));
    }
}
