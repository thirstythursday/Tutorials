/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swing_tutorials.components.mouseevents;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

/**
 *
 * @author george
 */
public class MouseEventDemo extends JPanel implements MouseListener {

    BlankArea blankArea;
    JTextArea textArea;
    JScrollPane scrollPane;
    static final String NEWLINE = System.getProperty("line.separator");

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
        }
        
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        
        javax.swing.SwingUtilities.invokeLater(new Runnable () {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("MouseEventDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // we can set the content pane to the class we are currently in?!
        JComponent newContentPane = new MouseEventDemo();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public MouseEventDemo() {
        super(new GridLayout(0,1));
        blankArea = new BlankArea(Color.YELLOW);
        add(blankArea);
        textArea = new JTextArea();
        textArea.setEditable(false);
        scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(200, 75));
        add(scrollPane);
        
        // add mouse listener to blankArea, we have instantiated it already
        blankArea.addMouseListener(this);
        
        // add mouse listener to scrollPane, why not?
        scrollPane.addMouseListener(this);
        
        // add mouse listener to this panel
        addMouseListener(this);
        
        setPreferredSize(new Dimension(650, 550));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }
    
    void eventOutput(String eventDescription, MouseEvent e) {
        textArea.append(eventDescription + " detected on " + e.getComponent().getClass().getName() + "." + NEWLINE);
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        eventOutput("Mouse pressed (# of clicks: " + e.getClickCount() + ")", e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        eventOutput("Mouse released (# of clicks: " + e.getClickCount() + ")", e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        eventOutput("Mouse entered", e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        eventOutput("Mouse exited", e);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        eventOutput("Mouse clicked (# of clicks: " + e.getClickCount() + ")", e);
    }
}