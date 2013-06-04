/*
 * A static variable doesn't mean it can't be changed, it means that if it
 * is changed IT IS CHANGED IN ALL INSTANCES OF THE CLASS.
 */
package classes_and_objects;

/**
 *
 * @author george
 */
public class IdentifyMyParts {
    
    public static int x = 7; // changing this changes it in ALL instances
    public int y = 3;
    
    /**
     * 
     */
    public static void main(String[] args) {
        
        IdentifyMyParts a = new IdentifyMyParts();
        IdentifyMyParts b = new IdentifyMyParts();
        a.y = 5;
        b.y = 6;
        a.x = 1; // was 7, now 1
        b.x = 2; // was 1, now 2
        
        System.out.println("a.y = " + a.y); // 5
        System.out.println("b.y = " + b.y); // 6
        System.out.println("a.x = " + a.x); // 2
        System.out.println("b.x = " + b.x); // 2
        // can do the following for x, not y because y isn't static
        System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);
    }
   
    
}
