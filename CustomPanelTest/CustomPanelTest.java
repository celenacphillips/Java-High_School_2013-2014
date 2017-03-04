//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CustomPanelTest extends JFrame {
    private JPanel buttonPanel;
    private CustomPanel myPanel;
    private JButton circleButton, squareButton;

    public CustomPanelTest () {
        super ("CustomPanel Test");

        myPanel = new CustomPanel ();
        myPanel.setBackground (Color.GREEN);

        squareButton = new JButton ("Square");
        squareButton.addActionListener (
            new ActionListener () {
                public void actionPerformed (ActionEvent event) {
                    myPanel.draw (CustomPanel.SQUARE);
                }//END public void actionPerformed (ActionEvent event)
            }//END new ActionListener ()
        );//END squareButton.addActionListener

        circleButton = new JButton ("Circle");
        circleButton.addActionListener (
            new ActionListener () {
                public void actionPerformed (ActionEvent event) {
                    myPanel.draw (CustomPanel.CIRCLE);
                }//END public void actionPerformed (ActionEvent event)
            }//END new ActionListener ()
        );//END circleButton.addActionListener

        buttonPanel = new JPanel ();
        buttonPanel.setLayout (new GridLayout (1, 2));
        buttonPanel.add (circleButton);
        buttonPanel.add (squareButton);

        Container container = getContentPane ();
        container.add (myPanel, BorderLayout.CENTER);
        container.add (buttonPanel, BorderLayout.SOUTH);

        setSize (300, 150);
        setVisible (true);
    }//END public CustomPanelTest ()

    public static void main (String [] args) {
        CustomPanelTest application = new CustomPanelTest ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class CustomPanelTest