package Strings.Assignment;

import java.util.Scanner;

public class countword {

    public static int countWord(String str){
        if(str.length() == 0){
            return 0;
        }
        int count = 1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) ==' ')
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int output = countWord(str);
        System.out.print(output);
    }
}
