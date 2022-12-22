package Array2.Assignment;

public class RotateArray {
/*public static void rotateArray(int arr[], int d){
    int p = 1;
    while(p <= d){
        int temp = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i+ 1];
        }
        arr[arr.length - 1] = temp;
        p++;
    }
}*/

    public static void rotateArray(int arr[], int d){
        int temp[] = new int[arr.length];
        int k = 0;
        for(int i = d; i < arr.length ; i++){
            temp[k] = arr[i];
            k++;
        }
        for(int i = 0; i < d; i++){
            temp[k] = arr[i];
            k++;
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 3, 1, 5, 9, 8};
        rotateArray(arr, 2);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
