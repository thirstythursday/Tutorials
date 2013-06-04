/*
 * All Graphical User Interfaces require some kind of main application frame
 * in which to display. In Swing, this is an instance of javax.swing.JFrame.
 * Therefore, our first step is to instantiate this class and make sure that
 * everything works as expected.
 * Note that when programming in Swing, your GUI creation code should be placed
 * on the Event Dispatch Thread (EDT). This will prevent potential race
 * conditions that could lead to deadlock. The following code listing shows how
 * this is done:
 */
package swing_tutorials.painting;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author george
 */
public class SwingPaintDemo1 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        System.out.println("Created GUI on EDT? " + SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("Swing Paint Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(250, 250);
        f.setVisible(true);
    }
}
