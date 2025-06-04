package main;
import javax.swing.JFrame;

public class App {
  public static void main(String[] args) throws Exception {
    JFrame window = new JFrame();

    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setTitle("RetroPG");

    GamePanel gamePanel = new GamePanel();
    window.add(gamePanel);

    window.pack();

    // the window will be displayed at the center of the screen
    window.setLocationRelativeTo(null);
    window.setVisible(true);

    gamePanel.startGameThread();
  }
}
