package Array2.Assignment;

public class Secondlargest {

    public static int secondLargestNumber(int arr[]){
        int l = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > l){
                s = l;
                l = arr[i];
            }
            if(arr[i] > s && arr[i] != l){
                s = arr[i];
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int arr[] = {2, 6, 1, 9, 8, 9, 7};
        int result = secondLargestNumber(arr);
        System.out.print(result);
    }
}
