/*
 * Nested classes with the variables of the same name as the enclosing class
 * "shadow" the declaration of the enclosing scope.]
 * 
 * This example has three variables called "x": the member variable of
 * NestedShadowTest, the member variable of FirstLevel, and the variable
 * defined as a parameter of methodInFirstLevel().
 * 
 */
package classes_and_objects;

public class NestedShadowTest {
    
    public int x = 0;
    
    class FirstLevel {
        
        public int x = 1;
        
        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            // referring to a member variable in a larger scope.
            System.out.println("NestedShadowTest.this.x = " + NestedShadowTest.this.x);
        }
    }
    
    public static void main(String... args) {
        NestedShadowTest nst = new NestedShadowTest();
        NestedShadowTest.FirstLevel f1 = nst.new FirstLevel();
        f1.methodInFirstLevel(23);
    }
    
}
