package Assighnment.Lecture8;

public class FahToCel {
    

        public static void printFahrenheitTable(int start, int end, int step) {
            /* Your class should be named Solution 
             * Don't write main(). 
             * Don't read input, it is passed as function argument. 
             * Print the specified output in required format. 
             * Taking input is handled automatically. 
             */
            for(int i = start; i <= end; i++){
                int c = (i - 32)*(5/9);
                System.out.println(i + " " + c);
            }
        }
    }

