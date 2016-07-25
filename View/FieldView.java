package View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Игорь on 19.07.2016.
 */
public class FieldView extends JFrame{

    public FieldView(String regView) {
        JPanel fieldView = new JPanel(new BorderLayout());
        this.setTitle(regView);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
        fieldView.add(new SnakeView(), BorderLayout.CENTER);
        this.setBackground(Color.GREEN);
        this.add(fieldView);
    }
}
