package Controller;

import Model.RegModel;
import View.FieldView;
import View.RegView;
import View.SnakeView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Игорь on 18.07.2016.
 */
public class SnakeController {

    private RegModel regModel = new RegModel();
    private RegView regView = new RegView();

    public SnakeController(RegView regView, RegModel regModel) {

        this.regModel = regModel;
        this.regView = regView;

        regView.addRegListner(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                regModel.setRegText(regView.getRegText());
                FieldView fieldView = new FieldView("Привет, " + regModel.getRegText() +"!");
                regView.setVisible(false);
                fieldView.setVisible(true);
                fieldView.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }
}
