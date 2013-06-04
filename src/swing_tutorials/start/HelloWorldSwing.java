/*
 * Let's get started with GUI
 */
package swing_tutorials.start;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldSwing {
    
    private static void createAndShowGUI () {
        // Create the window (JFrame) and exit behavior
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // add a JLabel
        JLabel label = new JLabel("Hello World!");
        frame.getContentPane().add(label);
        
        frame.pack(); // pack the frame tight to the content
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        // Sheduling a job for the event-dispatching thread
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    } 
}
