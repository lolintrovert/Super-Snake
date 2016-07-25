package View;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Игорь on 21.07.2016.
 */
public class SnakeView extends JPanel{

    public SnakeView() {
        setOpaque(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        int w = getWidth();
        int h = getHeight();
        BufferedImage buffer = new BufferedImage(w, h, BufferedImage.TYPE_4BYTE_ABGR);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2D.setColor(Color.YELLOW);
        g2D.fillOval(getWidth()/2, getHeight()/2, 25, 25);
    }
}
