package View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Игорь on 21.07.2016.
 */
public class SnakeView extends JPanel implements Runnable{

    private int x;
    private int y;

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public SnakeView() {
        setOpaque(true);
        (new Thread(this)).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2D.setColor(Color.YELLOW);
        g2D.fillOval(getWidth()/2, getHeight()/2, 25, 25);
    }

    @Override
    public void run() {
        while(true) {
            try {

                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void move() {

    }
}
