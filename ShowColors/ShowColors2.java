//Celena Williams

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShowColors2 extends JFrame {
    private JButton changeColorButton;
    private Color color = Color.LIGHT_GRAY;
    private Container container;

    public ShowColors2 () {
        super ("Using JColorChooser");

        container = getContentPane ();
        container.setLayout (new FlowLayout ());

        changeColorButton = new JButton ("Change Color");
        changeColorButton.addActionListener (
            new ActionListener () {
                public void actionPerformed (ActionEvent event) {
                    color = JColorChooser.showDialog (ShowColors2.this, 
                                                      "CHoose a color", color);

                    if (color == null)
                        color = Color.LIGHT_GRAY;

                    container.setBackground (color);
                }//END public void actionPerformed (ActionEvent event)
            }//END new ActionListener ()
        );//END changeColorButton.addActionListener

        container.add (changeColorButton);

        setSize (400, 130);
        setVisible (true);
    }//END public ShowColors2 ()

    public static void main (String [] args) {
        ShowColors2 application = new ShowColors2 ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class ShowColors2