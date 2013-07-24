package georgeoross;

/**
 *
 * @author george
 */
public class GUICaller {
    
    public static void main(String[] args) {
        GUI g = new GUI();
        Thread t = new Thread(g);
        t.start();
    }
    
}
