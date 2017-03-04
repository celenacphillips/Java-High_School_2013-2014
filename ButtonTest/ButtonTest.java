//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonTest extends JFrame {
    private JButton plainButton, fancyButton;

    public ButtonTest () {
        super ("Testing Buttons");

        Container container = getContentPane ();
        container.setLayout (new FlowLayout ());

        plainButton = new JButton ("Plain Button");
        container.add (plainButton);

        Icon bug1 = new ImageIcon ("bug1.gif");
        Icon bug2 = new ImageIcon ("bug2.gif");
        fancyButton = new JButton ("Fancy Button", bug1);
        fancyButton.setRolloverIcon (bug2);
        container.add (fancyButton);

        ButtonHandler handler = new ButtonHandler ();
        fancyButton.addActionListener (handler);
        plainButton.addActionListener (handler);

        setSize (275, 100);
        setVisible (true);
    }//END public ButtonTest ()

    public static void main (String [] args) {
        ButtonTest application = new ButtonTest ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)

    private class ButtonHandler implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            JOptionPane.showMessageDialog (ButtonTest.this, "You pressed: " + 
                                           event.getActionCommand ());
        }//END public void actionPerformed (ActionEvent event)
    }//END private class ButtonHandler
}//END public class ButtonTest