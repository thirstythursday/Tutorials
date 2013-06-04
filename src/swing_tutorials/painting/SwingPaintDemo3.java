package swing_tutorials.painting;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SwingPaintDemo3 {
    
    public static void main(String[] args) {
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
            int OFFSET = 1;
            
        }
    }

}
