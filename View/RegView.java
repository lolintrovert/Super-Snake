package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Игорь on 18.07.2016.
 */
public class RegView extends JFrame{

    private JButton regButton = new JButton("Начать");
    private JLabel regLabel = new JLabel("Как Вас зовут?");
    private JTextField regText = new JTextField(25);

    public RegView() {
        JPanel regPanel = new JPanel();
        Font font = new Font("Verdana", Font.BOLD, 11);
        this.setTitle("Змейка");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        regLabel.setFont(font);
        regButton.setFont(font);
        regPanel.setLayout(new FlowLayout());
        regPanel.add(regLabel);
        regPanel.add(regText);
        regPanel.add(regButton);
        this.add(regPanel);
    }

    public String getRegText() {
        return regText.getText();
    }

    public void addRegListner(ActionListener listenForRegButton) {
        regButton.addActionListener(listenForRegButton);
    }
}
