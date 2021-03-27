package g55836.luckynumbers;

import g55836.luckynumbers.controller.Controller;
import g55836.luckynumbers.model.Game;
import g55836.luckynumbers.model.Model;
import g55836.luckynumbers.view.MyView;

public class LuckyNumbers {
    public static void main(String[] args) {
        Model game = new Game();
        Controller controller = new Controller(game, new MyView(game));
        controller.play();
    }
}
