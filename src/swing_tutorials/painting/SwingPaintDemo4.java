/*
 * The MyPanel class should do all the painting logic, but for animation
 * every instance of a square can be an individual object. This is a technique
 * from 2D gaming and referred to a "sprite animation."
 */
package swing_tutorials.painting;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SwingPaintDemo4 {

    public static void main(String[] args) {
        // The anonymous inner class prevents us from having to make
        // a separate class that implements Runnable!
        Runnable r = new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        };
        SwingUtilities.invokeLater(r);
    }

    private static void createAndShowGUI() {
        System.out.println("Created GUI on the EDT? " + SwingUtilities.isEventDispatchThread());
        JFrame frame = new JFrame("Swing Paint Demo 4, the Sprites!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new MyPanel());
        frame.setSize(250, 250);
        frame.setVisible(true);
        
    }

    private static class MyPanel extends JPanel {
        
        RedSquare redSquare = new RedSquare();

        public MyPanel() {

            setBorder(BorderFactory.createLineBorder(Color.YELLOW, 5));

            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    moveSquare(e.getX(), e.getY());

                }
            });

            addMouseMotionListener(new MouseAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    moveSquare(e.getX(), e.getY());
                }
            });
        }

        private void moveSquare(int x, int y) {
            // these are final to avoid repeat invocations as square is moved
            final int CURR_X = redSquare.getX();
            final int CURR_Y = redSquare.getY();
            final int CURR_W = redSquare.getWidth();
            final int CURR_H = redSquare.getHeight();
            final int OFFSET = 1;
            
            if ((CURR_X != x) || (CURR_Y != y)) {
                // repaint the old location
                repaint(CURR_X,CURR_Y,CURR_W+OFFSET,CURR_H+OFFSET);
                // update coordinates
                redSquare.setX(x);
                redSquare.setY(y);
                // repaint at new location
                repaint(redSquare.getX(), redSquare.getY(), redSquare.getWidth()+OFFSET, redSquare.getHeight()+OFFSET);
            }
        }
        
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(250, 250);
        }
        
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawString("This is my custom panel!", 10, 20);
            // paint at current position
            redSquare.paintSquare(g);
        }
    }
    
    private static class RedSquare {
        private int xPos = 50;
        private int yPos = 50;
        private int width = 20;
        private int height = 20;

        public int getX() { return xPos; }
        public void setX(int xPos) { this.xPos = xPos; }
        public int getY() { return yPos; }
        public void setY(int yPos) { this.yPos = yPos; }
        public int getWidth() { return width; }
        public int getHeight() { return height; }
        
        // each RedSquare object is responsible to paint itsef, the code is in here
        public void paintSquare(Graphics g) {
            g.setColor(Color.red);
            g.fillRect(xPos, yPos, width, height);
            g.setColor(Color.red);
            g.drawRect(xPos, yPos, width, height);
        }
    }
}
