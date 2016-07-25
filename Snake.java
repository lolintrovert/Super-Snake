import Controller.SnakeController;
import Model.RegModel;
import View.RegView;
import View.SnakeView;

/**
 * Created by Игорь on 18.07.2016.
 */
public class Snake {
    public static void main(String[] args) {

        RegModel regModel = new RegModel();
        RegView regView = new RegView();

        SnakeController sController = new SnakeController(regView, regModel);

        regView.setVisible(true);
    }
}
