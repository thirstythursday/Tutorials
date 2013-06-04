/*
 * Because parameters shadow fields, field needs to be referenced using
 * the fully qualified name, using the "this" keyword to refer to the enclosing
 * object of the method.
 */
package classes_and_objects;

/**
 *
 * @author george
 */
public class Shadowing {
    
    private int x, y, radius;
    
    public void Shadowing() {
        // No shadowing here because no parameters. Can do this in a non-static
        // field (instance variable) as well.
        x = 0;
        y = 0;
        radius = 1;
    }
    
    public void Shadowing(int x, int y, int r) {
        // class constructor (overloaded here) is one place to do shadowing
        this.x = x;
        this.y = y;
        this.radius = r;
    }
    
    public void setOrigin(int x, int y) {
        // a class that sets the fields is another place to do shadowing
        this.x = x;
        this.y = y;
    }
}
