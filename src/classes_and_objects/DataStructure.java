/*
 * Inner class example
 * Create an array, fill it, output even values ascending
 */
package classes_and_objects;

public class DataStructure {
    // create an array
    private final static int SIZE = 15;
    private int [] arrayOfInts = new int[SIZE];
    
    public DataStructure() {
        // fill array
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    
    public void printEven() {
        // print out values of even indices of the array
        InnerEvenIterator iterator = this.new InnerEvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.getNext() + " ");
        }
    }

    // inner class implements the Iterator pattern
    private class InnerEvenIterator {

        private int next = 0; // start from the beginning

        private boolean hasNext() {
            // check if current element is last in the array
            return (next <= SIZE - 1);
        }

        private int getNext() {
            // record a value of an even index of the array;
            int retValue = arrayOfInts[next];
            // get the next even element
            next += 2;
            return retValue;
        }
    }

    public static void main(String[] args) {
        // fill array with integer values and print even values
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
