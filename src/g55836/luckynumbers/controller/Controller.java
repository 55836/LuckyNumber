package g55836.luckynumbers.controller;

import g55836.luckynumbers.model.Model;
import g55836.luckynumbers.view.View;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    public void play() {
        view.displayWelcome();
        while (true) {
            switch (model.getState()) {
                case NOT_STARTED:
                case GAME_OVER:
                    view.displayWinner();
                    model.start(view.askPlayerCount());
                    break;
                case PICK_TILE:
                    model.pickTile();
                    view.displayGame();
                    break;
                case PLACE_TILE:
                    model.putTile(view.askPosition());
                    break;
                case TURN_END:
                    model.nextPlayer();
                    break;
            }
        }
    }
}