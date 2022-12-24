package Strings;

import java.util.Scanner;

public class PrintAllChars {

    public static void printAllChar(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        printAllChar(str);
    }
}
