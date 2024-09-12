package prelim;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author NBSC
 */
public class ArraysAct3 {

    public static void main(String[] args) {
        // Step 1: Declare and initialize the string array
        String[] names = {"Zara", "Alex", "John", "Elena", "David"};

        // Step 2: Sort the array
        Arrays.sort(names);

        // Step 3: Display the sorted array using a for loop
        System.out.println("Names in alphabetical order (using a loop):");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println("\n");

        // Step 4: Display the sorted array using Arrays.toString()
        System.out.println("Names in alphabetical order (using Arrays.toString):");
        System.out.println(Arrays.toString(names));

        // Step 5: Challenge - Searching for a name
        String searchName = JOptionPane.showInputDialog("Enter the name you want to search:");

        boolean found = false;
        int index = -1;  // To store the index of the found name

// Loop through the array to search for the name
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                found = true;
                 index = i;
                break;  // Stop searching once the name is found
            }
        }

// Check if the name was found and display the result
        if (found) {
            JOptionPane.showMessageDialog(null, searchName + " was found in the array at index " + index + ".");
        } else {
            JOptionPane.showMessageDialog(null, searchName + " was not found in the array.");
        }

    }
}
