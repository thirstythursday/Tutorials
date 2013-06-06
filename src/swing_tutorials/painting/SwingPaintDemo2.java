/*
 * The second version, here we paint the panel then place a sring.
 */

package swing_tutorials.painting;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SwingPaintDemo2 {
    
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        };
        
        SwingUtilities.invokeLater(r);
        
    }
    
    private static void createAndShowGUI() {
        System.out.println("Created GUI on EDT? " + SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("Swing Paint Demo 2");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new MyPanel());
        f.pack();
        f.setVisible(true);
    }

    private static class MyPanel extends JPanel {

        public MyPanel() {
            // add subtle black border
            setBorder(BorderFactory.createLineBorder(Color.black));
        }
        
        /*
         * Adding a getPreferredSize() so we don't need the main app to set the
         * size, we just size the panel and call pack().
         */
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(250, 250);  
        }
        
        /*
         * Overriding a container's (in this case a panel) paintComponent()
         * method is how we draw graphics. Method is defined by JComponent and
         * overridden to provide custom behavior.
         */
        @Override
        public void paintComponent(Graphics g) {
            // The invocation of super.paintComponent(g) passes the graphics
            // context off to the component's UI delegate, which paints the
            // panel's background. 
            super.paintComponent(g);
            
            // Draw Text
            g.drawString("This is my custom Panel!", 20, 30);
        }
        
    }
    
}
