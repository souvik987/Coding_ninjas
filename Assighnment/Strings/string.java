package Strings;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        //int i = s.nextInt();
        str = s.next();
        System.out.println(str + " " + str.length());
        String str2 = s.nextLine();
        System.out.println(str2 + " " + str2.length());

        /*String str1 = "Coding";
        String substr = str1.substring(1, 5);
        System.out.println(substr);
        System.out.println(substr.length());
        */
    }
}
