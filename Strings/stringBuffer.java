package Strings;

public class stringBuffer {
    public static void main(String[] args) {
        
        StringBuffer str = new StringBuffer("abc");
        str.setCharAt(2, 'd');
        str.append("def");
        System.out.println(str + " " + str.length());
        
        

    }
}
