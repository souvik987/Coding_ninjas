package Array2;

public class binarySearch {

    public static int BinarySearch(int[] arr, int elem){
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end)/2;
        while(start <= end){
            if(arr[mid] == elem){
                return mid;
            } 
            else if(elem > arr[mid]){
                start = mid + 1;
            }
             else{
                end = mid - 1;
            }
        }
        return -1;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {6, 10, 15, 32, 35, 40, 45, 60};
       // int result = BinarySearch(arr, 40);
       final int elem = 40;
        System.out.println(BinarySearch(arr, elem));
    }
}
