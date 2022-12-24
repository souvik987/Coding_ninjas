package Strings;

import java.util.Scanner;

public class reverseEachword {

    public static String reverseEachWord(String str){
        String ans = "";
        int i;
        int currentWordStart = 0;
        for(i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                int currentWordEnd = i - 1;
                String reverseWord = "";
                for(int j = currentWordStart; j <= currentWordEnd; j++){
                    reverseWord = str.charAt(j) + reverseWord;
                }
            ans += reverseWord  + " ";
            currentWordStart = i + 1;
            }
        } 
        int currentWordEnd = i - 1;
        String reverseWord = "";
        for(int j = currentWordStart; j <= currentWordEnd; j++){
            reverseWord = str.charAt(j) + reverseWord;
        }
        ans += reverseWord;
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.print(reverseEachWord(str));
    }
}
