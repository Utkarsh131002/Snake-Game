package SnakeGame;
import javax.swing.*;
public class Game extends JFrame {
    Game(){
        super("Snake Game");

        add(new Board());
        pack();
        setResizable(false);
        setLocationRelativeTo(null);

    }
    public static void main(String[] args) {
        new Game().setVisible(true);
    }
}
