/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package georgeoross;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author george
 */
public class GUI implements Runnable {

    @Override
    public void run() {

        paintScene();
    }

    public void paintScene() {
        JFrame f = new JFrame("George's JFrame Hello World");
        JLabel l = new JLabel("George's JLabel Hello World", JLabel.CENTER);
        f.add(l);
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        GraphicsCar car = new GraphicsCar(100, 100);
        f.add(car);
        GraphicsCar carTurned = new GraphicsCar(150, 150);
        carTurned.changeFacing(90);
    }
}
