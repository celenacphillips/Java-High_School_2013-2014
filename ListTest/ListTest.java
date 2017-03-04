//Celena Williams

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListTest extends JFrame {
    private JList colorList;
    private Container container;

    private final String colorNames [] = {"Black", "Blue", "Cyan", "Dark Gray",
                                          "Gray", "Green", "Light Gray", 
                                          "Magenta", "Orange", "Pink", "Red",
                                          "White", "Yellow"};

    private final Color colors [] = {Color.BLACK, Color.BLUE, Color.CYAN, 
                                     Color.DARK_GRAY, Color.GRAY, Color.GREEN, 
                                     Color.LIGHT_GRAY, Color.MAGENTA, 
                                     Color.ORANGE, Color.PINK, Color.RED, 
                                     Color.WHITE, Color.YELLOW};

    public ListTest () {
        super ("List Test");

        container = getContentPane ();
        container.setLayout (new FlowLayout ());

        colorList = new JList (colorNames);
        colorList.setVisibleRowCount (5);

        colorList.setSelectionMode (ListSelectionModel.SINGLE_SELECTION);

        container.add (new JScrollPane (colorList));
        colorList.addListSelectionListener (
            new ListSelectionListener () {
                public void valueChanged (ListSelectionEvent event) {
                    container.setBackground (colors 
                                               [colorList.getSelectedIndex ()]);
                }//END public void valueChanged (ListSelectionEvent event)
            }//END new ListSelectionListener ()
        );//END colorList.addListSelectionListener

        setSize (400, 400);
        setVisible (true);
    }//END public ListTest ()

    public static void main (String [] args) {
        ListTest application = new ListTest ();
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//END public static void main (String [] args)
}//END public class ListTest