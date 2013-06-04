/*
 * called from the CreateObjectDemo class
 */

package classes_and_objects;

/**
 *
 * @author george
 */
class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;
    
    // no-argument constructor
    public Rectangle() {
        origin = new Point(0, 0);
    }
    
    public Rectangle(Point p) {
        origin = p;
    }

    public Rectangle(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    
    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }
    
    // moving the origin by passing ints into the Point field of the
    // Rectangle inside the method by accessing the Point object's fields.
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    public int getArea() {
        return width * height;
    }
    
}
