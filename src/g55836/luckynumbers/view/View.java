package g55836.luckynumbers.view;

import g55836.luckynumbers.model.Position;

public interface View {
    void displayWelcome();
    void displayGame();
    void displayWinner();
    int askPlayerCount();
    Position askPosition();
    void displayError(String message);
}