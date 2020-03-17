package general;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowParam extends JFrame implements ActionListener {
    private JPanel pan = new JPanel();

    private String[] goBanSizeChoice = {"9x9","13x13","19x19"};
    private String[] goBanHandicap = {"1","2","3","4","5","6","7","8"};
    private String[] goBanKomi = {"5","10","15"};

    private JButton startButton = new JButton("Start");

    private JLabel sizeField = new JLabel("Taille grille");
    private JComboBox sizeChoice = new JComboBox(goBanSizeChoice);

    private JLabel handiField = new JLabel("Handicap");
    private JComboBox handicapChoice = new JComboBox(goBanHandicap);

    private JLabel komiField = new JLabel("Komi");
    private JComboBox komiChoice = new JComboBox(goBanKomi);

    public WindowParam(){
        this.setTitle("Jeu de Go");
        this.setSize(1000,1000);
        this.setLocation(0,0);
        this.setVisible(true);

        pan.add(sizeField);
        pan.add(sizeChoice);

        pan.add(handiField);
        pan.add(handicapChoice);

        pan.add(komiField);
        pan.add(komiChoice);

        pan.add(startButton);

        this.setContentPane(pan);

        startButton.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int size = Integer.parseInt((sizeChoice.getSelectedItem().toString()).split("x")[0]);

        int handicap = Integer.parseInt(handicapChoice.getSelectedItem().toString());

        int komi = Integer.parseInt(komiChoice.getSelectedItem().toString());

        Main.test(size, handicap, komi);
        WindowGame winGame = new WindowGame();
        this.dispose();
    }
}
