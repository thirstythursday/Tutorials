/*
 * The Applet version, uses the DynamicTreePanel class as its content pane
 * This is how to turn an application (JFrame) into an applet.
 */

package java_applets;

import java.lang.reflect.InvocationTargetException;
import javax.swing.JApplet;
import javax.swing.SwingUtilities;

public class DynamicTreeApplet extends JApplet {
    public void init() {
        // init() is called when the browser loads the applet
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
            public void run() {
                createGUI();
            }
});
        } catch (InterruptedException | InvocationTargetException e) {
            System.err.println("createGUI didn't complete successfully");
        }
    }
    
    private void createGUI() {
        DynamicTreePanel newContentPane = new DynamicTreePanel();
        newContentPane.setOpaque(true);
        setContentPane(newContentPane);
        
    }
    
}
