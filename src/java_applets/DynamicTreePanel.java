/*
 * The JFrame version
 */

package java_applets;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;

public class DynamicTreePanel extends JPanel implements ActionListener {
    
    private int newNodeSuffix = 1;
    private static String ADD_COMMAND = "remove";
    private static String REMOVE_COMMAND = "remove";
    private static String CLEAR_COMMAND = "clear";
    
    private DynamicTree treePanel;
    
    public DynamicTreePanel() {
        super(new BorderLayout());
        
        treePanel = new DynamicTree();
        populateTree(treePanel);
        
        JButton addButton = new JButton("Add");
        addButton.setActionCommand(ADD_COMMAND);
        addButton.addActionListener(this);
        
        JButton removeButton = new JButton("Remove");
        addButton.setActionCommand(REMOVE_COMMAND);
        addButton.addActionListener(this);
        
        JButton clearButton = new JButton("Clear");
        addButton.setActionCommand(CLEAR_COMMAND);
        addButton.addActionListener(this);
        
        treePanel.setPreferredSize(new Dimension (300, 150));
        add(treePanel, BorderLayout.CENTER);
        
        JPanel panel = new JPanel(new GridLayout(0, 3));
        panel.add(addButton);
        panel.add(removeButton);
        panel.add(clearButton);
        add(panel, BorderLayout.SOUTH);
        
    }


    private void populateTree(DynamicTree treePanel) {
        String p1Name = new String("Parent 1");
        String p2Name = new String("Parent 2");
        String c1Name = new String("Child 1");
        String c2Name = new String("Child 2");

        DefaultMutableTreeNode p1, p2;
        
        p1 = treePanel.addObject(null, p1Name);
        p2 = treePanel.addObject(null, p2Name);
        
        treePanel.addObject(p1, c1Name);
        treePanel.addObject(p1, c2Name);
        
        treePanel.addObject(p2, c1Name);
        treePanel.addObject(p2, c2Name);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String command = e.getActionCommand();
        
        if (ADD_COMMAND.equals(command)) {
            treePanel.addObject("New Node " + newNodeSuffix++);
        } else if (REMOVE_COMMAND.equals(command)) {
            treePanel.removeCurrentNode();
        } else if (CLEAR_COMMAND.equals(command)) {
            treePanel.clear();
        }
    }
    
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("DynamicTreePanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DynamicTreePanel newContentPane = new DynamicTreePanel();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
        frame.pack();
        frame.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
}
