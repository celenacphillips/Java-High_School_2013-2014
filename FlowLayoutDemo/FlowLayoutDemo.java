//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlowLayoutDemo extends JFrame {
    private JButton leftButton, centerButton, rightButton;
    private Container container;
    private FlowLayout layout;

    public FlowLayoutDemo () {
        super ("FlowLayout Demo");

        layout = new FlowLayout ();

        container = getContentPane ();
        container.setLayout (layout);

        leftButton = new JButton ("Left");
        container.add (leftButton);
        leftButton.addActionListener (
            new ActionListener () {
                public void actionPerformed (ActionEvent event) {
                    layout.setAlignment (FlowLayout.LEFT);

                    layout.layoutContainer (container);
                }//END public void actionPerformed (ActionEvent event)
            }//END new ActionListener ()
        );//END leftButton.addActionListener

        centerButton = new JButton ("Center");
        container.add (centerButton);
        centerButton.addActionListener (
            new ActionListener () {
                public void actionPerformed (ActionEvent event) {
                    layout.setAlignment (FlowLayout.CENTER);

                    layout.layoutContainer (container);
                }//END public void actionPerformed (ActionEvent event)
            }//END new ActionListener ()
        );//END centerButton.addActionListener

        rightButton = new JButton ("Right");
        container.add (rightButton);
        rightButton.addActionListener (
            new ActionListener () {
                public void actionPerformed (ActionEvent event) {
                    layout.setAlignment (FlowLayout.RIGHT);

                    layout.layoutContainer (container);
                }//END public void actionPerformed (ActionEvent event)
            }//END new ActionListener ()
        );//END rightButton.addActionListener

        setSize (300, 75);
        setVisible (true);
    }//END public FlowLayoutDemo ()

    public static void main (String [] args) {
        FlowLayoutDemo application = new FlowLayoutDemo ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class FlowLayoutDemo