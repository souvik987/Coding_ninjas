package Recursion_1;

public class GeometricSum {

    public static double geometricSum(int k){
        if(k == 0){
            return 1;
        }
        double ans = geometricSum( k - 1);
        return ans + (1 / Math.pow(2, k));
    }

    public static void main(String[] args) {
        System.out.print(geometricSum(3));
    }
}
