package georgeoross;

/**
 * A threading example
 * @author george
 */
public class GUICallerThreaded {
    
    public static void main(String[] args) {
        
        GUI g = new GUI();
        
        Thread threadA = new Thread(g);
        
        threadA.start();
    }
    
}
