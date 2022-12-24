package Strings.Assignment;

import java.util.Scanner;

public class CheckPermutation {

    public static boolean isPermutation(String str1, String str2){
        int frequencyArr[] = new int[256];
		int count = 0;
		for(int i = 0; i < str1.length(); i++){
			int ch = str1.charAt(i);
			frequencyArr[ch] = frequencyArr[ch] + 1;
		}
		for(int i = 0; i < str2.length(); i++){
			int ch = str2.charAt(i);
			frequencyArr[ch] = frequencyArr[ch] - 1;
		}
		for(int i = 0; i < 256; i++){
			if (frequencyArr[i] == 0){
				count++;
			}
		}
		if(count == 256){
			return true;
		}
		else{
			return false;
		}
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        System.out.print(isPermutation(str1, str2));
    }
}
