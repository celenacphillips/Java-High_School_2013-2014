//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Coin extends JApplet implements ActionListener {
    JButton tossButton;
    JLabel sideLabel;

    public Coin () {
        Container container = getContentPane ();
        container.setLayout (new FlowLayout ());

        tossButton = new JButton ("Toss");
        tossButton.addActionListener (this);
        container.add (tossButton);

        sideLabel = new JLabel ("");
        container.add (sideLabel);
    }//END public Coin ()

    public void actionPerformed (ActionEvent e) {
        boolean output = flip ();

        if (output == true)
            sideLabel.setText ("Heads");
        else
            sideLabel.setText ("Tails");
    }//END public void actionPerformed (ActionEvent e)

    public boolean flip () {
        int randomNumber = (int) (1 + Math.random () * 2);

        if (randomNumber == 1)
            return false;
        else
            return true;
    }//END public boolean flip ()
}//END public class Coin