/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package georgeoross;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author george
 */
public class SomeMoreDrawing extends JFrame {
    
    public static void main (String... args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() { 
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
    public static void createAndShowGUI() {
        JFrame jf = new JFrame("Direct draw on the standard content pane");
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        
        
        // this content pane is already part of the jframe, not an added
        // jpanel. Therefore it is a CONTAINER.
       jf.setContentPane(new JPanel() {
           public void paintComponent(Graphics g) {
               super.paintComponent(g);
               g.setColor(Color.blue);
               g.draw3DRect(50, 50, 50, 50, true);
               g.drawString("My String", 40, 40);
           }
       });
        
    }
    
}
