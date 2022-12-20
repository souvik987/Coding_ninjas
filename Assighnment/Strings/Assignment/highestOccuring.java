package Strings.Assignment;

import java.util.Scanner;

public class highestOccuring {

    public static int highestOccuringCharacters(String str){
        int frequencyArr[] = new int[256];
        for(int i = 0; i < str.length(); i++){
            int ch = str.charAt(i);
            frequencyArr[ch] = frequencyArr[ch] + 1;
        }
        int charIndex = str.charAt(0);
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            int index = str.charAt(i);
            if(frequencyArr[index] > count){
                charIndex = str.charAt(i);
                count = frequencyArr[index];
            }
        }
        return charIndex;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.print(highestOccuringCharacters(str));

    }
}
