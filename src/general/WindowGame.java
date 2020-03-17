package general;

import javax.swing.*;
import java.awt.*;

public class WindowGame extends JFrame {
    private JPanel pan = new JPanel();

    public WindowGame() {
        this.setTitle("Jeu de Go");
        this.setSize(1000,1000);
        this.setLocation(0,0);
        this.setVisible(true);

        this.setContentPane(pan);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
