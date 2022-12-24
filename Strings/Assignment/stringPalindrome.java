package Strings.Assignment;

import java.util.Scanner;

public class stringPalindrome {

    public static boolean checkPalindrome(String str){
        boolean isPalindrome = true;
        int i = 0;
        int j = str.length() - 1;
        while(i < str.length()/2){
            if(str.charAt(i) != str.charAt(j)){
                isPalindrome = false;
                break;
            }
            else{
                i++;
                j--;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        boolean output = checkPalindrome(str);
        System.out.print(output);
    }
}
