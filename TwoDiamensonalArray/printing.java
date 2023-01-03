package TwoDiamensonalArray;

import java.util.Scanner;

public class printing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int rows = s.nextInt();
        System.out.print("Enter the no. of coloumns: ");
        int cols = s.nextInt();
        int input[][] = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.println("Enter element at "+i+"  rows + "+j+"  coloumns");
                input[i][j] = s.nextInt();
            }
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(input[i][j] + " ");
            }
        System.out.println();
        }
    }
}
