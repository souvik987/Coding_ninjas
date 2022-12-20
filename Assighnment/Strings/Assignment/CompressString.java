package Strings.Assignment;

import java.util.Scanner;

public class CompressString {

    public static String compressedString(String str){
        int i, count = 1;
        String ans = "";
        for(i = 0; i < str.length() - 1; i++){
            if(str.charAt(i + 1) == str.charAt(i)){
                count++;
            }
            else{
                if(count != 1)
                ans = ans + str.charAt(i) + count;
                else
                ans = ans + str.charAt(i);
                count = 1;
            }
        }
        if(count != 1)
        ans = ans + str.charAt(i) + count;
        else
        ans = ans + str.charAt(i);
    return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.print(compressedString(str));
    }
}
