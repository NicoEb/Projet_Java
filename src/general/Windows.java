package general;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Windows extends JFrame implements ActionListener {
    private JPanel pan = new JPanel();
    private  JButton button1 = new JButton("New Game");
    private  JButton button2 = new JButton("Load Game");
    private  JButton button3 = new JButton("Rules");

    public Windows(){
        this.setTitle("Jeu de Go");
        this.setSize(1000,1000);
        this.setLocation(0,0);
        this.setVisible(true);
        pan.add(button1);
        pan.add(button2);
        pan.add(button3);
        this.setContentPane(pan);

        button1.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        WindowParam win = new WindowParam();
        this.dispose();
    }
}
