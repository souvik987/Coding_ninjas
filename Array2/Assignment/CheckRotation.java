package Array2.Assignment;

public class CheckRotation {

    public static int checkRotationArray(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                return i + 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {5, 6, 1, 2, 3, 4};
        int result = checkRotationArray(arr);
        System.out.print(result); 
    }
}
