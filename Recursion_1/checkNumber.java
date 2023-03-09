package Recursion_1;

public class checkNumber {

    public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/

		if(input.length == 1){
			if(input[0] == x){
                return true;
            }
            else{
                return false;
            }
		}
        else if(input[input.length - 1] == x){
            return true;
        }
        int smallcheck[] =  new int[input.length - 1];
		for(int i = 0; i < input.length - 1; i++){
		    smallcheck[i] = input[i];
		}
		boolean ans = checkNumber(smallcheck,x);
        return ans;
		
	}
    public static void main(String[] args) {
        int input[] = { 1, 2, 3, 5, 7};
        int x = 5;
        System.out.println(checkNumber(input, x));
    }
}
