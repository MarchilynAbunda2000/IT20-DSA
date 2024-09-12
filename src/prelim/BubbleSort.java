
package prelim;

/**
 *
 * @author Marchilyn A. Abunda
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;

        // Bubble Sort algorithm
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // Display sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
