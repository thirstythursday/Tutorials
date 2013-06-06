/*
 * Final version of the paint demo. Fancy Shmancy.
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

public class SwingPaintDemo3 {
    
    public static void main(String[] args) {
        // handy idiom, but can be done another way
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
 
    
    private static void createAndShowGUI() {
        System.out.println("Created GUI on the EDT? " + SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("Swing Paint Demo");
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new MyPanel());
        f.pack();
        f.setVisible(true);
    }

    
    private static class MyPanel extends JPanel {
        
        private int squareX = 50;
        private int squareY = 50;
        private int squareW = 20;
        private int squareH = 20;

        public MyPanel() {
            setBorder(BorderFactory.createLineBorder(Color.black));
            
            // put mouse listeners in the constructor of the panel, not the JFrame?
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

        /**
         * This method is extra work, but is efficient and gives good results
         */
        private void moveSquare(int x, int y) {
            int OFFSET = 1;
            if ((squareX != x) || (squareY != y)) {
                // first invocation of repaint paints where the square WAS
                repaint(squareX, squareY, squareW + OFFSET, squareH + OFFSET);
                squareX = x;
                squareY = y;
                // second invocation of repaint now paints where the square IS
                repaint(squareX, squareY, squareW + OFFSET, squareH + OFFSET);
            }
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(250, 250);
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawString("This is my custom panel", 10, 20);
            g.setColor(Color.RED);
            g.fillRect(squareX, squareY, squareW, squareH);
            g.setColor(Color.BLACK);
            g.drawRect(squareX, squareY, squareW, squareH);
            
            // instead of the moveSquare() efficiency mess just uncomment the next line:
            // repaint();
        }
    }
}

