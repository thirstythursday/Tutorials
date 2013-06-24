package georgeoross;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.TexturePaint;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.*;


public class StackExchangeGridExample extends JPanel {

    public static final Ground[][] MAP = {
        {Ground.GRASS, Ground.GRASS, Ground.DIRT, Ground.WATER, Ground.WATER},
        {Ground.GRASS, Ground.DIRT, Ground.CITY, Ground.WATER, Ground.WATER},
        {Ground.GRASS, Ground.DIRT, Ground.CITY, Ground.WATER, Ground.WATER},
        {Ground.GRASS, Ground.DIRT, Ground.DIRT, Ground.DIRT, Ground.WATER},
        {Ground.GRASS, Ground.GRASS, Ground.DIRT, Ground.WATER, Ground.WATER},
    };
    private JLabel[][] labelGrid = new JLabel[MAP.length][MAP[0].length];

    public StackExchangeGridExample() {
        setLayout(new GridLayout(MAP.length, MAP[0].length));
        for (int r = 0; r < labelGrid.length; r++) {
            for (int c = 0; c < labelGrid[r].length; c++) {
                labelGrid[r][c] = new JLabel();
                labelGrid[r][c].setIcon(MAP[r][c]);
                add(labelGrid[r][c]);
            }
        }
    }

    private static void createAndShowGui() {
        StackExchangeGridExample mainPanel = new StackExchangeGridExample();
        JFrame frame = new JFrame("GridExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(mainPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                createAndShowGui();
            }
        });
    }
}
enum Ground implements Icon {

    DIRT(new Color(205, 133, 63)), GRASS(new Color(0, 107, 60)),
    WATER(new Color(29, 172, 214)), CITY(Color.lightGray);
    private static final int SIZE = 42;
    private Random random = new Random();
    private TexturePaint paint;

    private Ground(Color color) {
        this.paint = initPaint(color);
    }

    private TexturePaint initPaint(Color color) {
        BufferedImage image = new BufferedImage(
            SIZE, SIZE, BufferedImage.TYPE_INT_ARGB);
        Rectangle2D.Double rect = new Rectangle2D.Double(0, 0, SIZE, SIZE);
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (random.nextBoolean()) {
                    image.setRGB(col, row, color.getRGB());
                } else {
                    if (random.nextBoolean()) {
                        image.setRGB(col, row, color.darker().getRGB());
                    } else {
                        image.setRGB(col, row, color.brighter().getRGB());
                    }
                }
            }
        }
        return new TexturePaint(image, rect);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(paint);
        g.fillRect(0, 0, SIZE, SIZE);
    }

    @Override
    public int getIconWidth() {
        return SIZE;
    }

    @Override
    public int getIconHeight() {
        return SIZE;
    }
}