/*
 * instanceof (all lowercase) is just a type comparison operator.
 * instanceof evaluates to TRUE if the object is an instance of the
 * class, a superclass, or an interface implemented in the class.
 */
package language_basics;

/**
 *
 * @author george
 */
public class InstanceofDemo {
    public static void main(String[] args) {
        
        Parent object1 = new Parent();
        Parent object2 = new Child();
        
        System.out.println("object1 instanceof Parent: " + (object1 instanceof Parent));
        System.out.println("object1 instanceof Child: " + (object1 instanceof Child));
        System.out.println("object1 instanceof MyInterface: " + (object1 instanceof MyInterface));
        System.out.println();
        System.out.println("object2 instanceof Parent: " + (object2 instanceof Parent));
        System.out.println("object2 instanceof Child: " + (object2 instanceof Child));
        System.out.println("object2 instanceof MyInterface: " + (object2 instanceof MyInterface));
    }

    private static class Parent {}
    private static class Child extends Parent implements MyInterface {}
    interface MyInterface {}
    
}
