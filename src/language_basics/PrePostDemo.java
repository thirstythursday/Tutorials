/*
 * Pre and postfix operators. ++i and i++ both evaluate the same,
 * but before or after the assignment.
 */

package language_basics;

public class PrePostDemo {

    public static void main(String[] args) {
        int i = 3;
        i++;
        System.out.println(i); // 4
        ++i;
        System.out.println(i); // 5
        System.out.println(++i); // 6
        // In the following expression i IS incremented, but after printing the line
        System.out.println(i++); // 6
        System.out.println(i); // 7
    }
}
