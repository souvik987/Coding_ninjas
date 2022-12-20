package Lecture7;
import java.util.Scanner;
public class Sum_Till_N {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum = sum + i;
        }
        System.out.print(sum);
    }
}
