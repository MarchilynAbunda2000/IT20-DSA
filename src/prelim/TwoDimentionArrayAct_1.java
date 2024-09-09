
package prelim;

/**
 *
 * @author Marchilyn Abunda Sept 9, 2024
 */
public class TwoDimentionArrayAct_1 {
    public static void main(String[] args) {
        // Step 1: Create a 2D array of students and their favorite subjects
        String[][] students = {
            {"John", "Math"},
            {"Maria", "Science"},
            {"Jane", "History"},
            {"Mark", "English"}
        };

    
        for(int i = 0; i < students.length; i++) {
            System.out.println("Student: " + students[i][0] + ", Favorite Subject: " + students[i][1]);
        }

    }
    
}
