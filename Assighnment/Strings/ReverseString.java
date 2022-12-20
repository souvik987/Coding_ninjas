package Strings;

public class ReverseString {

    public static String reversedString(String str){
        String reversString = "";
       /*  for(int i = str.length() - 1; i >= 0; i--){
            reversString += str.charAt(i);
        }*/
        for(int i = 0; i < str.length(); i++){
            reversString = str.charAt(i) + reversString;
        }
        return reversString;
    }

    public static void main(String[] args) {
        String str = "abcde";
        String output = reversedString(str);
        System.out.print(output);
    }
}
