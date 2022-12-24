package Strings.Assignment;

import java.util.Scanner;

public class RemoveConsecutive {

    public static String removeConsecutiveDuplicates(String str){
        String ans = "";
        char ch = str.charAt(0);
        ans += ch;
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ch){

            }
            else{
                ans += str.charAt(i);
                ch = str.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.print(removeConsecutiveDuplicates(str));
    }
}
