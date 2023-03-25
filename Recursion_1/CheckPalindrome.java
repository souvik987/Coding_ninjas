package Recursion_1;

public class CheckPalindrome {

public static boolean checkPalidrome(String input){
    return checkPalidrome(input, 0, input.length() - 1);
}

private static boolean checkPalidrome(String input, int startIndex, int lastIndex){
    if(startIndex == lastIndex){
        return true;
    }
    if(input.charAt(startIndex) != input.charAt(lastIndex)){
        return false;
    }
    if(startIndex < lastIndex + 1){
        return checkPalidrome(input, startIndex + 1, lastIndex - 1);
    }
    return true;

}
    public static void main(String[] args) {
        String input = "abcdba";
        System.out.print(checkPalidrome(input));
    }
}
