package prelim;

import java.util.Arrays;

/**
 *
 * @author Marchilyn A. Abunda
 */
public class ArrayAct2 {

    public static void main(String[] args) {
        int[] arr = {50, 10, 30, 20, 40};

        // Sort the array
        Arrays.sort(arr);

         System.out.println("Print arrays using for Loop:"); 

//        Display using Loop
        for(int i=0; i<arr.length; i++){
            
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        
        // Print the sorted array
        System.out.println("Print arrays using Arrays.toString method:  \n"+ Arrays.toString(arr)); 
        
//        Notes:
//          Arrays.toString(): Converts the entire array into a string, making it easier to print and read. It only works in Single Dimentional Array
//          Arrays.sort(): Sorts the elements of an array in ascending order (either numerical or lexicographical).
    }
}
