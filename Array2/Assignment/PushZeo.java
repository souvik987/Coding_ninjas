package Array2.Assignment;

public class PushZeo {

    public static void pushZeroToEnd(int arr[]){
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 0, 0, 1, 9, 0, 8, 0};
        pushZeroToEnd(arr);
        for(int i = 0;  i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
