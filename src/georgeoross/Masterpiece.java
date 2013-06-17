/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package georgeoross;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author george
 */
public class Masterpiece extends JPanel {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        JFrame easel = new JFrame("It isn't the Mona Lisa!");
        easel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        easel.add(new Canvas());
        easel.setSize(300, 300);
        easel.setVisible(true);
    }

    private static class Canvas extends JPanel {
        private int mousePosX = 0;
        private int mousePosY = 0;

        public Canvas() {
        
        // this MouseAdapter class is a great anonymous inner class I can use
        // to avoid having to implement all the abstract mouse methods in Canvas!
        // here I'm adding a MouseMotionListener object to the Canvas JPanel component
        addMouseMotionListener(new MouseAdapter() {
                @Override
                public void mouseMoved(MouseEvent e) {
                    drawTrail(e.getX(), e.getY());
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            // super.paintComponent(g); forget it, we're doing the background
            
            // blue background, if the mouse hasn't moved yet, dont want to overwrite
            if (mousePosX == 0 && mousePosY == 0) {
                g.setColor(Color.blue);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
            
            // Draw Pac-Man
            g.setColor(Color.yellow);
            g.fillArc(20, 20, 100, 100, 45, 270);
            
            // Draw some dots
            
            g.setColor(Color.white);
            g.fillOval(130, 65, 20, 20);
            g.fillOval(170, 65, 20, 20);
            g.fillOval(210, 65, 20, 20);
            
            // Draw a message, still in white frostesm earlier
            g.drawString("PAC MAN FEVER", 10, 200);
            
            // draw tiny rectangle on repaint
            g.drawRect(mousePosX, mousePosY, 1, 1);
            
            // try to draw short lines instead of little 1px rectangles
            
        }
        
        public void drawTrail(int x, int y) {
            mousePosX = x;
            mousePosY = y;
            repaint();
        }

    }

}
