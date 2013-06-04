/* 
 * An example of object creation, assignment, calling constructors, etc.
 */
package classes_and_objects;

/**
 *
 * @author george
 */
public class CreateObjectDemo {
    
    public static void main(String[] args) {
        
        Point p; // declaring a reference variable, no object created
        Point originOne = new Point(23, 94); // object *is* created with "new"
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);
        
        System.out.println("Width of rectOne: " + rectOne.width);
        System.out.println("Height of rectOne: " + rectOne.height);
        System.out.println("Area of RectOne: " + rectOne.getArea());
        
        rectTwo.origin = originOne;
        
        System.out.println("X Position of rectTwo: " + rectOne.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
        
        rectTwo.move(40, 72);
        
        System.out.println("X Position of rectTwo: " + rectOne.origin.x);
        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
    }
}
