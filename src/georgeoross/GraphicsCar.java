/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package georgeoross;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author george
 */
public class GraphicsCar extends JPanel {
    Dimension MINIMUM_SIZE = new Dimension(40,120); 
    double NORTH = 0;
    double EAST = 90;
    Point location = new Point(0, 0);
    int xCoord;
    int yCoord;
    
    /**
     *
     * @param x
     * @param y
     */
    public GraphicsCar(int x, int y) {
        location.setLocation(x, y);
        xCoord = (int) location.getX();
        yCoord = (int) location.getY();
        drawCar();
    }

    @Override
    public Dimension getMinimumSize() {
        return MINIMUM_SIZE;
    }
    
    @Override
    public Dimension getPreferredSize() {
        return MINIMUM_SIZE;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.black);
        g2.setStroke(new BasicStroke());
        g2.draw(new Rectangle2D.Double(0 + xCoord, 0 + yCoord, 20, 20));
        g2.setPaint(Color.gray);
        g2.draw(new Rectangle2D.Double(1 + xCoord, 41 + yCoord, 38, 38));
    }

    void changeFacing(int direction) {
        
    }

    private void drawCar() {
        
    }
    
}
