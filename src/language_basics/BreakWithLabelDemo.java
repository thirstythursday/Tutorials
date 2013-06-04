/*
 * Also a good example of declaring a multidimensional array, not just
 * labeled break statements. The labeled break terminates the labeled
 * statement, it does not transfer control to the label, but the statement
 * immediately following.
 */
package language_basics;

/**
 *
 * @author george
 */
public class BreakWithLabelDemo {
    public static void main(String[] args) {
        
        int[][] arrayOfInts = {
            {32, 87, 3, 589},
            {12, 1076, 2000, 8},
            {622, 127, 77, 955}
        };

        int searchFor = 77;
        int i;
        int j = 0;
        boolean foundIt = false;

        search:
        for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == searchFor) {
                    foundIt = true;
                    break search;
                }
            }
        }
        
        if (foundIt) {
            System.out.println("Found " + searchFor + " at " + i + ", " + j);
        } else {
            System.out.println(searchFor + " not in the array");
        }
    }
}
